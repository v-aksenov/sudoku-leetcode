class SudokuValidator {

    fun isValidSudoku(board: Array<CharArray>): Boolean {
        board.forEach { if (!isLineValid(it)) return false }
        board.mapIndexed {
                index, _ -> collectVerticalLine(board, index)
        }.forEach { if (!isLineValid(it)) return false }
        for (i in 0..6 step 3) {
            for (j in 0 .. 6 step 3) {
                if (!isLineValid(collectBlockToLine(board, i, j))) return false
            }
        }
        return true
    }

    private fun collectBlockToLine(board: Array<CharArray>, iStart: Int, jStart: Int): CharArray {
        var blockChars = charArrayOf()
        for (i in iStart..(iStart + 2)) {
            for (j in jStart..(jStart + 2)) {
                blockChars = blockChars.plus(board[i][j])
            }
        }
        return blockChars
    }

    private fun collectVerticalLine(board: Array<CharArray>, index: Int): CharArray {
        var chars = charArrayOf()
        board.forEach { chars = chars.plus(it[index]) }
        return chars
    }

    private fun isLineValid(line: CharArray): Boolean =
        line
            .filter { it != '.' }
            .let {
                it.distinct().size == it.size
            }

}
