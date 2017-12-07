all:
	javac *.java -Xdiags:verbose
	#javac ./symbolic/*.java -Xdiags:verbose

run: all
	java SymbCalc

clean:
	rm -f *.class
	#rm -f ./symbolic/*.class
