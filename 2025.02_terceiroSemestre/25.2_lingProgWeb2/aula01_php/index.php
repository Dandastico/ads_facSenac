<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>
        Conceitos iniciais do PHP
    </h1>
    <?php
        echo"Vamos prosseguir!";
        //comentario
        # comentario
        /* comentario em linhas */
        echo "</br>";

        $name = "Daniel";
        $age = 30;

        echo "$name";
        echo "</br>";
        echo "$age";

        //TIPOS:
        // boolean: 0 ou 1 - true ou false
        // int: inteiro - números positivos e negativos
        // float: decimais - positivos e negativos
        // strings: texto
        echo "</br>";
        $mundo = "mundo";
        echo "Olá, $mundo";
        echo "</br>";
        echo 'Olá, $mundo'; // aspas simples não lê o valor da variável, imprime como string
        echo "</br>";
        echo "Olá, " . $mundo;
        echo "</br>";


        // constante
        echo "</br>";
        define(constant_name: "PHP", value: "open source");

        echo "</br>";
        const HTML = "Linguagem de marcação";
        echo "PHP";
        echo "</br>";
        echo HTML;
        echo "</br>";

        // conversão de variável
        $var = 100;
        echo "$var";
        echo "</br>";
        $type_casting = (bool) $var;
        echo "$var";
        echo "</br>";
        echo $type_casting = (bool) $var;
        echo "</br>";

        // números
        echo "</br>";
        $a = 3;
        $b = 4;
        $c = $a / $b;
        echo $c;
        echo "</br>";

        // teste para saber se a linguagem é dinâmica
        echo "</br>";
        $str = "daniel";
        $str = 1;
        echo $str; // o bagulho é linguagem dinâmica
        echo "</br>";

        // incremento no echo
        echo "</br>";
        $num = 0;
        echo "$num </br>";
        $num += 1;
        echo "$num </br>";
        echo ++$num;
        echo "</br>";
        echo $num++;


    ?>
</body>
</html>