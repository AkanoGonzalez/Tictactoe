class CheckWin {
    //Code funktioniert wie Gewollt IntelliJ markiert es aber als Fehler
    //mit IntelliJ's Korrekturanweisungen funktioniert das Spiel nicht mehr
    static boolean checkWin(char[][] board, char player) {
        return (
                (board[0][0] == player && board[0][1] == player && board[0][2] == player) ||
                        (board[1][0] == player && board[1][1] == player && board[1][2] == player) ||
                        (board[2][0] == player && board[2][1] == player && board[2][2] == player) ||
                        (board[0][0] == player && board[1][0] == player && board[2][0] == player) ||
                        (board[0][1] == player && board[1][1] == player && board[2][1] == player) ||
                        (board[0][2] == player && board[1][2] == player && board[2][2] == player) ||
                        (board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
                        (board[0][2] == player && board[1][1] == player && board[2][0] == player)
        )
    }

    static boolean hasPlayerWon(char[][] board, char player) {
        return checkWin(board, player)
    }
}