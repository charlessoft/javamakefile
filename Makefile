SOURCES=./Say.java \
		./Person.java
JAVAC=javac
JAVA=java
PACKAGE=com.csdn.test
CLASSPATH=.:"/home/charles/javamakefile/lib/log4j-1.2.15.jar":"/home/charles/javamakefile/com/csdn/test"
target:
	$(JAVAC) -classpath $(CLASSPATH) -d . $(SOURCES)
run:
	$(JAVA) -classpath $(CLASSPATH) $(PACKAGE).Say

