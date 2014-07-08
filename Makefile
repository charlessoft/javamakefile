SOURCES=./Say.java \
		./Person.java
JAVAC=javac
JAVA=java
PACKAGE=com.csdn.test

target:
	$(JAVAC) -d . $(SOURCES)
run:
	$(JAVA) $(PACKAGE).Say

