class TicTacToe {
  static char[][] board = [
          ['1', '2', '3'],
          ['4', '5', '6'],
          ['7', '8', '9']
  ]

  static void printBoard() {
    board.each { row ->
      println row.join(' | ')
    }
    println ""
  }
}