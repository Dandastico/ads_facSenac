<?php 
    $age = 17;

    if ($age < 18) {
        echo "vaza daqui";
    } else {
        echo "pode entrar, campeão";
    }

    echo "</br>";

    $nome = 'Fulano de Tal';
    if($nome == 'Ciclano') {
        echo ('olá ciclano');
    } elseif ($nome == 'outro') {
        echo ('outro nome');
    } elseif ($nome == 'outro de novo') {
        echo ('oi outro nome de novo');
    } else {
        echo ("e ae $nome");
    }

    echo "</br>";
    echo "</br>";

    // switch-case
    $pkmn = "Bulbassauro";

    switch($pkmn) {
        case "Charmander":
            echo ("Char char");
            break;
        case "Squirtle":
            echo ("Squirtle squirtle");
            break;
        case "Bulbassauro" :
            echo ("Bulba bulbassaur");
            break;
        default:
            echo ("Não tenho esse Pokemon");
    }