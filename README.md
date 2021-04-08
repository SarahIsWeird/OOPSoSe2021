# OOP Sommersemester 2021

Hey! Hier sind alle Lösungen zu den Übungsaufgaben fürs Sommersemester 2021. Bevor du dir eine Lösung anschaust, bitte versuche erst, selbst eine zu finden.

## Bevor du startest, hier ein paar wichtige (und unwichtige) Infos:

Normalerweise lege ich großen Wert auf [semantische Versionierung](https://semver.org/). Das klappt bei den Übungsaufgaben nich so. Daher ist alles in Packages unterteilt.  Lösungen zu Übung 1 findet man in ``com.sarahisweird.oopsose2021.uebung1``, Lösungen zu Übung 2 in ``com.sarahisweird.oopsose2021.uebung2``, usw.

Alle Lösungen, insbesondere die von komplexeren Aufgaben, unterliegen grundsätzlich dem Copyright von Sarah Klocke, sofern möglich. Der Grund ist, dass ich sinnloses Kopieren vermeiden will. Ich bin eine vehemente Anhängerin von freier Software, aber in der Uni muss das ja nicht sein. Damit tut ihr euch keinen Gefallen ;)

Die Lösungen sind am besten in [IntelliJ IDEA](https://www.jetbrains.com/idea/) nachvollziehbar. Du kannst sie natürlich in jedem Texteditor betrachten und kompilieren, aber die Projektstruktur ist für IDEA optimiert. Tut mir leid, das benutze ich halt hihi. Bei Fragen zur Kompilierung könnt ihr mich gerne anschreiben.

Apropos: Dieses Projekt benutzt [Gradle](https://gradle.org/). Gradle ist nicht grade einfach zu verstehen, vor allem für Java-Anfänger, aber dadurch wird die Projektstrukturierung verbessert. Sowohl Eclipse als auch IntelliJ können Gradle-Projekte importieren. Tut das! Das erspart euch Einrichtungsarbeit.
- Ihr müsst im Gradle-Tab nur ``jar`` suchen und ausführen. Dann ist alles gebaut!
- Ihr benutzt keine IDE? Bitte, tut euch den Gefallen und ladet euch [IntelliJ IDEA](https://www.jetbrains.com/idea/) oder [Eclipse](https://www.eclipse.org/) runter. IntelliJ kann mehr, Eclipse ist einfacher. Eure Entscheidung! Ich kann euch da auch gerne beraten, ganz unabhängig von meiner persönlichen Meinung.
- Ihr hängt an Notepad++? Na gut, dann könnt ihr die Aufgaben wie üblich über die Kommandozeile kompilieren und ausführen!

PRs sind gerne gesehen! Wenn ihr der Meinung seid, dass eure Lösung kompakter/besser/whatever ist, dann lasst doch alle dran teilhaben! :D (Ich mache auch Fehler lmao)

## Wie führe ich den Kack aus??

*Vorab: Dieser Paragraph beschäftigt sich nur mit der von Gradle erstellten Datei. Wenn ihr das per Kommandozeile kompiliert, ist es auch trivial, das auszuführen.*

Ordentliche Projektstruktur bedeutet leider auch, dass alles etwas komischer ist. Zuerst solltet ihr, wie eben schon erwähnt, den ``jar``-Task ausgeführt haben. Dann findet ihr unter ``build/libs`` die gebaute ``.jar``-Datei. Entweder ihr kopiert die euch irgendwohin und geht mit der Kommandozeile dahin, ihr drückt ``Shift+Rechtsklick`` im Ordner und öffnet die Kommandozeile in dem Ordner, oder ihr benutzt die Konsole von eurer IDE. Das ist euch überlassen. Auf jeden Fall sollte die Datei im aktuellen Verzeichnis der Kommandozeile sein.

Wenn ihr das fertig habt, könnt ihr die einzelnen Aufgaben so ausführen: ``java -cp OOP-1.0.jar com.sarahisweird.oopsose2021.uebungA.AufgabeB``, wobei ``A`` für die jeweilige Übung bzw. ``B`` für die Aufgabe steht. Aufgabe 3 der 2. Übung würde dann so ausgeführt werden: ``java -cp . com.sarahisweird.oopsose2021.uebung2.aufgabe3``

### Was bedeutet das alles?

Cool, dass du dich dafür interessierst! Das wird jetzt allerdings etwas technisch.

Die Java-Umgebung ist in viele verschiedene Dateien unterteilt, sogenannte Klassen. (Der Begriff Klasse für diese Dateien kommt daher, dass in einer Datei normalerweise nur eine Klasse steht.) Java weiß allerdings nicht, wo alle diese Dateien sind. Dafür gibt es den sogenannten Klassenpfad, oder auch englisch *class path*. Dieser funktioniert ähnlich wie die Path-Umgebungsvariable: Der class path gibt an, wo sich die Klassen befinden.
- Diese Klassen könnten als ``.class``-Datei geliefert werden. Das Problem ist, dass das bei großen Projekten gerne mal tausende Klassen sind. Daher werden diese in eine ``.jar``-Datei gebündelt.

Mit dem Argumenten ``-cp`` geben wir an, welche Dateien zum class path zugezählt werden sollen. In diesem Fall ist das unsere eben kompilierte ``.jar``-Datei. Das reicht allerdings nicht aus: Java weiß ja jetzt gar nicht, was von den vielen Dateien es ausführen soll.

Daher geben wir die Klasse samt Package an, die wir ausführen wollen. Packages sind eigentlich nur Ordner, nix besonderes. In diesem Fall ist das Package ``com.sarahisweird.oopsose2021.uebungA``, und die Klasse ist ``AufgabeB``, wobei ``A`` und ``B`` halt wieder für Zahlen stehen.
- In Java werden Packages normalerweise mit der umgedrehten Domain der Firma/Privatperson + des Projektnamens benannt. Meine Domain ist ``sarahisweird.com`` und das Projekt ist ``OOP SoSe 2021``. Leerzeichen sind nicht erlaubt! Packages werden außerdem kleingeschrieben.

## Hast du auch Hobbies?

Nö.