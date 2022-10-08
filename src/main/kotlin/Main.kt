fun main(args: Array<String>) {
    val sudokuLine1 = charArrayOf('.', '.', '.', '.', '.', '.', '.', '.', '.')
    val sudokuLine2 = charArrayOf('.', '.', '.', '.', '.', '.', '3', '.', '.')
    val sudokuLine3 = charArrayOf('.', '.', '.', '1', '8', '.', '.', '.', '.')

    val sudokuLine4 = charArrayOf('.', '.', '.', '7', '.', '.', '.', '.', '.')
    val sudokuLine5 = charArrayOf('.', '.', '.', '.', '1', '.', '9', '7', '.')
    val sudokuLine6 = charArrayOf('.', '.', '.', '.', '.', '.', '.', '.', '.')

    val sudokuLine7 = charArrayOf('.', '.', '.', '3', '6', '.', '1', '.', '.')
    val sudokuLine8 = charArrayOf('.', '.', '.', '.', '.', '.', '.', '.', '.')
    val sudokuLine9 = charArrayOf('.', '.', '.', '.', '.', '.', '.', '2', '.')

    val sudoku = arrayOf(
        sudokuLine1,
        sudokuLine2,
        sudokuLine3,
        sudokuLine4,
        sudokuLine5,
        sudokuLine6,
        sudokuLine7,
        sudokuLine8,
        sudokuLine9,
    )
    println(SudokuValidator().isValidSudoku(sudoku))
}
