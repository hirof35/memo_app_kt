import javax.swing.*
import java.awt.BorderLayout
import java.io.File

fun main() {
    val frame = JFrame("Kotlin Swing Notepad")
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.setSize(600, 400)

    val textArea = JTextArea()
    frame.add(JScrollPane(textArea), BorderLayout.CENTER)

    // --- メニューバーの作成 ---
    val menuBar = JMenuBar()
    val fileMenu = JMenu("ファイル(F)")

    val openItem = JMenuItem("開く...")
    val saveItem = JMenuItem("名前を付けて保存...")
    val exitItem = JMenuItem("終了")

    fileMenu.add(openItem)
    fileMenu.add(saveItem)
    fileMenu.addSeparator() // 仕切り線
    fileMenu.add(exitItem)
    menuBar.add(fileMenu)

    frame.jMenuBar = menuBar

    // --- ファイル選択用のダイアログ ---
    val fileChooser = JFileChooser()

    // 開くアクション
    openItem.addActionListener {
        val result = fileChooser.showOpenDialog(frame)
        if (result == JFileChooser.APPROVE_OPTION) {
            val file = fileChooser.selectedFile
            textArea.text = file.readText() // ファイルの内容を読み込み
        }
    }

    // 保存アクション
    saveItem.addActionListener {
        val result = fileChooser.showSaveDialog(frame)
        if (result == JFileChooser.APPROVE_OPTION) {
            val file = fileChooser.selectedFile
            file.writeText(textArea.text) // テキストエリアの内容を書き込み
            JOptionPane.showMessageDialog(frame, "保存しました")
        }
    }

    // 終了アクション
    exitItem.addActionListener { System.exit(0) }

    frame.isVisible = true
}
