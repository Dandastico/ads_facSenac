<?php
    // operador ternário- muito utilizado em front-end

    $number1 = 1;
    $number2 = 2;

    if ($number1 > $number2) {
        $s = 'Número 1 maior que número 2';
    } else {
        $s = 'Número 2 é maior que número 1';
    }

    // operador ternário
    $ternario = ($number1 > $number2) ? "numero 1 ...":"numero 2 ...";

    echo "</br>";
    echo $s;
    echo "</br>";
    echo $ternario;
    // fim do exemplo

    echo "</br></br>";

    // arrays associativas (estrutura chave-valor)
    $estacao = array('verão' => '21/12 a 21/3');

    echo "</br></br>";

    // laço de repetição while
    $num = 0;
    while ($num < 10) {
        echo $num++;
    }
    echo "</br></br>";
    // laço d erepetição do-while
    $count = 2000;
    do {
        $dobro = $count + $count;
        echo "O dobro de $count é $dobro";
        $count++;
    } while ($count <= 1999);

    echo "</br></br>";

    // laço de repetição for
    for ($n = 1; $n <= 10; $n++) {
        $cubo = $n * $n * $n;
        echo "o cubo de $n é $cubo<br>";
    }

    echo "</br></br>";

    // laço de repetição for-each
    $ead = array("aprendendo", "php", "go horse");

    foreach ($ead as $valor) {
        echo "$valor ";
    }