Kotlin Swing Notepad
KotlinとJava Swingを利用した、非常に軽量でシンプルなデスクトップ向けメモ帳アプリケーションです。

📋 機能
テキスト編集: 自由なテキスト入力が可能です。

ファイルを開く: ローカルのテキストファイルを選択して読み込みます。

名前を付けて保存: 編集した内容を新しいファイルとして保存します。

スクロール対応: 長い文章でもJScrollPaneにより快適に閲覧・編集できます。

🚀 セットアップと実行
前提条件
JDK 8 以上

Kotlin コンパイラ または IntelliJ IDEA

実行方法
このリポジトリをクローンするか、Main.ktとしてファイルを保存します。

以下のコマンドでコンパイルおよび実行します。

Bash
kotlinc Main.kt -include-runtime -d notepad.jar
java -jar notepad.jar
🛠 使用技術
Language: Kotlin

GUI Framework: Java Swing (Standard API)

📂 コードのポイント
BorderLayout: テキストエリアを中央に配置し、ウィンドウサイズに合わせて自動調整します。

JFileChooser: 標準的なファイル選択ダイアログを提供します。

Extension Functions: KotlinのFile.readText()やFile.writeText()を使用することで、Javaよりも簡潔なファイルI/Oを実現しています。

📝 ライセンス
このプロジェクトは MITライセンス のもとで公開されています。
