all:
	javac *.java -Xdiags:verbose

run: all
	java SymbCalc

clean:
	rm -f *.class
