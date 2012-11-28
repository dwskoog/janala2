$env:PATH += ";yices-2.1.0/bin"
$CLASSPATH_BASE="out/production/tests;lib/asm-all-3.3.1.jar;lib/scala-library.jar;lib/commons-lang3-3.1.jar"
$CLASSPATH_AGENT_RUN="$CLASSPATH_BASE;out/production/janala"
$CLASSPATH="$CLASSPATH_BASE;lib/trove-3.0.3.jar;lib/choco-solver-2.1.4.jar;lib/iagent.jar"
$iter=$args[0]
$YOURPGM=$args[1]

[void]{rm -Force inputs
rm -Force history}

echo "Now testing $YOURPGM"

for ($i=1; $i -le $iter; $i++ ) {
  echo "[Input $i]"
  &java -javaagent:"lib/iagent.jar"  -cp ('"'+$CLASSPATH_AGENT_RUN+'"') -ea $YOURPGM
  &java ('-Djanala.mainClass="'+$YOURPGM+'"') ('-Djanala.iteration='+$i) -cp ('"'+$CLASSPATH+'"') -ea janala.interpreters.LoadAndExecuteInstructions
  

  if (Test-Path history) {
    echo ""
  }
  else {
    break
  }
}
