class TicTacToeGame {
  static char[][] board = [
          ['1', '2', '3'],
          ['4', '5', '6'],
          ['7', '8', '9']
  ]

  static void printBoard() {
    for (int i = 0; i < 3; i++) {
      println board[i].join(' | ')
      if (i < 2) {
        println "---------"
      }
    }
    println ""
  }

  static boolean isBoardFull() {
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (board[i][j] != 'X' && board[i][j] != 'O') {
          return false
        }
      }
    }
    return true
  }

  static void main(String[] args) {
    Scanner scanner = new Scanner(System.in)
    char currentPlayer = 'X'
    boolean gameWon = false

    while (!gameWon && !isBoardFull()) {
      printBoard()

      println "Spieler ${currentPlayer}, wähle ein Feld (1-9):"
      def input = scanner.nextLine()

      if (!input.isNumber() || input.toInteger() < 1 || input.toInteger() > 9) {
        println "Ungültige Eingabe. Bitte wähle eine Zahl zwischen 1 und 9."
        continue
      }

      int move = input.toInteger() - 1
      int row = move / 3
      int col = move % 3

      if (board[row][col] == 'X' || board[row][col] == 'O') {
        println "Das Feld ist bereits belegt. Wähle ein anderes Feld."
        continue
      }

      board[row][col] = currentPlayer

      gameWon = checkWin.hasPlayerWon(board, currentPlayer)

      if (!gameWon) {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X'
      }
    }

    printBoard()

    if (gameWon) {
      println "Spieler ${currentPlayer} gewinnt!"
    } else {
      println "Unentschieden!"
    }
  }
}
