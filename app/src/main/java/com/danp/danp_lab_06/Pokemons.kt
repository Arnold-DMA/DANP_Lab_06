package com.danp.danp_lab_06

object Pokemons {
    data class Pokemon(
        val numero: String,
        val nombre: String,
        val imagen: String,
        val tipo_principal: String,
        val tipo_secundario: String,
        val region: String
    )

    val pokeList: List<Pokemon> = listOf(
        Pokemon(
            "001",
            "Bulbasaur",
            "https://static.wikia.nocookie.net/pokemongo/images/4/43/Bulbasaur.png",
            "Grass",
            "Poison",
            "Kanto"
            ),
        Pokemon(
            "002",
            "Ivysur",
            "https://static.wikia.nocookie.net/pokemongo/images/8/86/Ivysaur.png",
            "Grass",
            "Poison",
            "Kanto"
        ),
        Pokemon(
            "003",
            "Venusaur",
            "https://static.wikia.nocookie.net/pokemongo/images/b/be/Venusaur.png",
            "Grass",
            "Poison",
            "Kanto"
        ),
        Pokemon(
            "004",
            "Charmander",
            "https://static.wikia.nocookie.net/pokemongo/images/5/56/Charmander.png",
            "Fire",
            "",
            "Kanto"
        ),
        Pokemon(
            "005",
            "Charmeleon",
            "https://static.wikia.nocookie.net/pokemongo/images/f/fb/Charmeleon.png",
            "Fire",
            "",
            "Kanto"
        ),
        Pokemon(
            "006",
            "Charizard",
            "https://static.wikia.nocookie.net/pokemongo/images/9/95/Charizard.png",
            "Fire",
            "Flying",
            "Kanto"
        ),
        Pokemon(
            "007",
            "Squirtle",
            "https://static.wikia.nocookie.net/pokemongo/images/e/e3/Squirtle.png",
            "Water",
            "",
            "Kanto"
        ),
        Pokemon(
            "008",
            "Wartortle",
            "https://static.wikia.nocookie.net/pokemongo/images/d/d7/Wartortle.png",
            "Water",
            "",
            "Kanto"
        ),
        Pokemon(
            "009",
            "Blastoise",
            "https://static.wikia.nocookie.net/pokemongo/images/4/41/Blastoise.png",
            "Water",
            "",
            "Kanto"
        ),
        Pokemon(
            "010",
            "Bulbasaur",
            "https://static.wikia.nocookie.net/pokemongo/images/4/43/Bulbasaur.png",
            "Grass",
            "Poison",
            "Kanto"
        ),
        Pokemon(
            "011",
            "Ivysur",
            "https://static.wikia.nocookie.net/pokemongo/images/8/86/Ivysaur.png",
            "Grass",
            "Poison",
            "Kanto"
        ),
        Pokemon(
            "012",
            "Venusaur",
            "https://static.wikia.nocookie.net/pokemongo/images/b/be/Venusaur.png",
            "Grass",
            "Poison",
            "Kanto"
        ),
        Pokemon(
            "013",
            "Charmander",
            "https://static.wikia.nocookie.net/pokemongo/images/5/56/Charmander.png",
            "Fire",
            "",
            "Kanto"
        ),
        Pokemon(
            "014",
            "Charmeleon",
            "https://static.wikia.nocookie.net/pokemongo/images/f/fb/Charmeleon.png",
            "Fire",
            "",
            "Kanto"
        ),
        Pokemon(
            "015",
            "Charizard",
            "https://static.wikia.nocookie.net/pokemongo/images/9/95/Charizard.png",
            "Fire",
            "Flying",
            "Kanto"
        ),
        Pokemon(
            "016",
            "Squirtle",
            "https://static.wikia.nocookie.net/pokemongo/images/e/e3/Squirtle.png",
            "Water",
            "",
            "Kanto"
        ),
        Pokemon(
            "017",
            "Wartortle",
            "https://static.wikia.nocookie.net/pokemongo/images/d/d7/Wartortle.png",
            "Water",
            "",
            "Kanto"
        ),
        Pokemon(
            "018",
            "Blastoise",
            "https://static.wikia.nocookie.net/pokemongo/images/4/41/Blastoise.png",
            "Water",
            "",
            "Kanto"
        ),
        Pokemon(
            "019",
            "Bulbasaur",
            "https://static.wikia.nocookie.net/pokemongo/images/4/43/Bulbasaur.png",
            "Grass",
            "Poison",
            "Kanto"
        ),
        Pokemon(
            "020",
            "Ivysur",
            "https://static.wikia.nocookie.net/pokemongo/images/8/86/Ivysaur.png",
            "Grass",
            "Poison",
            "Kanto"
        ),
        Pokemon(
            "021",
            "Venusaur",
            "https://static.wikia.nocookie.net/pokemongo/images/b/be/Venusaur.png",
            "Grass",
            "Poison",
            "Kanto"
        ),
        Pokemon(
            "022",
            "Charmander",
            "https://static.wikia.nocookie.net/pokemongo/images/5/56/Charmander.png",
            "Fire",
            "",
            "Kanto"
        ),
        Pokemon(
            "023",
            "Charmeleon",
            "https://static.wikia.nocookie.net/pokemongo/images/f/fb/Charmeleon.png",
            "Fire",
            "",
            "Kanto"
        ),
        Pokemon(
            "024",
            "Charizard",
            "https://static.wikia.nocookie.net/pokemongo/images/9/95/Charizard.png",
            "Fire",
            "Flying",
            "Kanto"
        ),
        Pokemon(
            "025",
            "Squirtle",
            "https://static.wikia.nocookie.net/pokemongo/images/e/e3/Squirtle.png",
            "Water",
            "",
            "Kanto"
        ),
        Pokemon(
            "026",
            "Wartortle",
            "https://static.wikia.nocookie.net/pokemongo/images/d/d7/Wartortle.png",
            "Water",
            "",
            "Kanto"
        ),
        Pokemon(
            "027",
            "Blastoise",
            "https://static.wikia.nocookie.net/pokemongo/images/4/41/Blastoise.png",
            "Water",
            "",
            "Kanto"
        ),
        Pokemon(
            "028",
            "Bulbasaur",
            "https://static.wikia.nocookie.net/pokemongo/images/4/43/Bulbasaur.png",
            "Grass",
            "Poison",
            "Kanto"
        ),
        Pokemon(
            "029",
            "Ivysur",
            "https://static.wikia.nocookie.net/pokemongo/images/8/86/Ivysaur.png",
            "Grass",
            "Poison",
            "Kanto"
        ),
        Pokemon(
            "030",
            "Venusaur",
            "https://static.wikia.nocookie.net/pokemongo/images/b/be/Venusaur.png",
            "Grass",
            "Poison",
            "Kanto"
        ),
        Pokemon(
            "031",
            "Charmander",
            "https://static.wikia.nocookie.net/pokemongo/images/5/56/Charmander.png",
            "Fire",
            "",
            "Kanto"
        ),
        Pokemon(
            "032",
            "Charmeleon",
            "https://static.wikia.nocookie.net/pokemongo/images/f/fb/Charmeleon.png",
            "Fire",
            "",
            "Kanto"
        ),
        Pokemon(
            "033",
            "Charizard",
            "https://static.wikia.nocookie.net/pokemongo/images/9/95/Charizard.png",
            "Fire",
            "Flying",
            "Kanto"
        ),
        Pokemon(
            "034",
            "Squirtle",
            "https://static.wikia.nocookie.net/pokemongo/images/e/e3/Squirtle.png",
            "Water",
            "",
            "Kanto"
        ),
        Pokemon(
            "035",
            "Wartortle",
            "https://static.wikia.nocookie.net/pokemongo/images/d/d7/Wartortle.png",
            "Water",
            "",
            "Kanto"
        ),
        Pokemon(
            "036",
            "Blastoise",
            "https://static.wikia.nocookie.net/pokemongo/images/4/41/Blastoise.png",
            "Water",
            "",
            "Kanto"
        ),
        Pokemon(
            "037",
            "Bulbasaur",
            "https://static.wikia.nocookie.net/pokemongo/images/4/43/Bulbasaur.png",
            "Grass",
            "Poison",
            "Kanto"
        ),
        Pokemon(
            "038",
            "Ivysur",
            "https://static.wikia.nocookie.net/pokemongo/images/8/86/Ivysaur.png",
            "Grass",
            "Poison",
            "Kanto"
        ),
        Pokemon(
            "039",
            "Venusaur",
            "https://static.wikia.nocookie.net/pokemongo/images/b/be/Venusaur.png",
            "Grass",
            "Poison",
            "Kanto"
        ),
        Pokemon(
            "040",
            "Charmander",
            "https://static.wikia.nocookie.net/pokemongo/images/5/56/Charmander.png",
            "Fire",
            "",
            "Kanto"
        ),
        Pokemon(
            "041",
            "Charmeleon",
            "https://static.wikia.nocookie.net/pokemongo/images/f/fb/Charmeleon.png",
            "Fire",
            "",
            "Kanto"
        ),
        Pokemon(
            "042",
            "Charizard",
            "https://static.wikia.nocookie.net/pokemongo/images/9/95/Charizard.png",
            "Fire",
            "Flying",
            "Kanto"
        ),
        Pokemon(
            "043",
            "Squirtle",
            "https://static.wikia.nocookie.net/pokemongo/images/e/e3/Squirtle.png",
            "Water",
            "",
            "Kanto"
        ),
        Pokemon(
            "044",
            "Wartortle",
            "https://static.wikia.nocookie.net/pokemongo/images/d/d7/Wartortle.png",
            "Water",
            "",
            "Kanto"
        ),
        Pokemon(
            "045",
            "Blastoise",
            "https://static.wikia.nocookie.net/pokemongo/images/4/41/Blastoise.png",
            "Water",
            "",
            "Kanto"
        ),
        Pokemon(
            "046",
            "Bulbasaur",
            "https://static.wikia.nocookie.net/pokemongo/images/4/43/Bulbasaur.png",
            "Grass",
            "Poison",
            "Kanto"
        ),
        Pokemon(
            "047",
            "Ivysur",
            "https://static.wikia.nocookie.net/pokemongo/images/8/86/Ivysaur.png",
            "Grass",
            "Poison",
            "Kanto"
        ),
        Pokemon(
            "048",
            "Venusaur",
            "https://static.wikia.nocookie.net/pokemongo/images/b/be/Venusaur.png",
            "Grass",
            "Poison",
            "Kanto"
        ),
        Pokemon(
            "049",
            "Charmander",
            "https://static.wikia.nocookie.net/pokemongo/images/5/56/Charmander.png",
            "Fire",
            "",
            "Kanto"
        ),
        Pokemon(
            "050",
            "Charmeleon",
            "https://static.wikia.nocookie.net/pokemongo/images/f/fb/Charmeleon.png",
            "Fire",
            "",
            "Kanto"
        ),
        Pokemon(
            "051",
            "Charizard",
            "https://static.wikia.nocookie.net/pokemongo/images/9/95/Charizard.png",
            "Fire",
            "Flying",
            "Kanto"
        ),
        Pokemon(
            "052",
            "Squirtle",
            "https://static.wikia.nocookie.net/pokemongo/images/e/e3/Squirtle.png",
            "Water",
            "",
            "Kanto"
        ),
        Pokemon(
            "053",
            "Wartortle",
            "https://static.wikia.nocookie.net/pokemongo/images/d/d7/Wartortle.png",
            "Water",
            "",
            "Kanto"
        ),
        Pokemon(
            "054",
            "Blastoise",
            "https://static.wikia.nocookie.net/pokemongo/images/4/41/Blastoise.png",
            "Water",
            "",
            "Kanto"
        ),
        Pokemon(
            "055",
            "Bulbasaur",
            "https://static.wikia.nocookie.net/pokemongo/images/4/43/Bulbasaur.png",
            "Grass",
            "Poison",
            "Kanto"
        ),
        Pokemon(
            "056",
            "Ivysur",
            "https://static.wikia.nocookie.net/pokemongo/images/8/86/Ivysaur.png",
            "Grass",
            "Poison",
            "Kanto"
        ),
        Pokemon(
            "057",
            "Venusaur",
            "https://static.wikia.nocookie.net/pokemongo/images/b/be/Venusaur.png",
            "Grass",
            "Poison",
            "Kanto"
        ),
        Pokemon(
            "058",
            "Charmander",
            "https://static.wikia.nocookie.net/pokemongo/images/5/56/Charmander.png",
            "Fire",
            "",
            "Kanto"
        ),
        Pokemon(
            "059",
            "Charmeleon",
            "https://static.wikia.nocookie.net/pokemongo/images/f/fb/Charmeleon.png",
            "Fire",
            "",
            "Kanto"
        ),
        Pokemon(
            "060",
            "Charizard",
            "https://static.wikia.nocookie.net/pokemongo/images/9/95/Charizard.png",
            "Fire",
            "Flying",
            "Kanto"
        ),
        Pokemon(
            "061",
            "Squirtle",
            "https://static.wikia.nocookie.net/pokemongo/images/e/e3/Squirtle.png",
            "Water",
            "",
            "Kanto"
        ),
        Pokemon(
            "062",
            "Wartortle",
            "https://static.wikia.nocookie.net/pokemongo/images/d/d7/Wartortle.png",
            "Water",
            "",
            "Kanto"
        ),
        Pokemon(
            "063",
            "Blastoise",
            "https://static.wikia.nocookie.net/pokemongo/images/4/41/Blastoise.png",
            "Water",
            "",
            "Kanto"
        ),
        Pokemon(
            "064",
            "Bulbasaur",
            "https://static.wikia.nocookie.net/pokemongo/images/4/43/Bulbasaur.png",
            "Grass",
            "Poison",
            "Kanto"
        ),
        Pokemon(
            "065",
            "Ivysur",
            "https://static.wikia.nocookie.net/pokemongo/images/8/86/Ivysaur.png",
            "Grass",
            "Poison",
            "Kanto"
        ),
        Pokemon(
            "066",
            "Venusaur",
            "https://static.wikia.nocookie.net/pokemongo/images/b/be/Venusaur.png",
            "Grass",
            "Poison",
            "Kanto"
        ),
        Pokemon(
            "067",
            "Charmander",
            "https://static.wikia.nocookie.net/pokemongo/images/5/56/Charmander.png",
            "Fire",
            "",
            "Kanto"
        ),
        Pokemon(
            "068",
            "Charmeleon",
            "https://static.wikia.nocookie.net/pokemongo/images/f/fb/Charmeleon.png",
            "Fire",
            "",
            "Kanto"
        ),
        Pokemon(
            "069",
            "Charizard",
            "https://static.wikia.nocookie.net/pokemongo/images/9/95/Charizard.png",
            "Fire",
            "Flying",
            "Kanto"
        ),
        Pokemon(
            "070",
            "Squirtle",
            "https://static.wikia.nocookie.net/pokemongo/images/e/e3/Squirtle.png",
            "Water",
            "",
            "Kanto"
        ),
        Pokemon(
            "071",
            "Wartortle",
            "https://static.wikia.nocookie.net/pokemongo/images/d/d7/Wartortle.png",
            "Water",
            "",
            "Kanto"
        ),
        Pokemon(
            "072",
            "Blastoise",
            "https://static.wikia.nocookie.net/pokemongo/images/4/41/Blastoise.png",
            "Water",
            "",
            "Kanto"
        ),
        Pokemon(
            "073",
            "Bulbasaur",
            "https://static.wikia.nocookie.net/pokemongo/images/4/43/Bulbasaur.png",
            "Grass",
            "Poison",
            "Kanto"
        ),
        Pokemon(
            "074",
            "Ivysur",
            "https://static.wikia.nocookie.net/pokemongo/images/8/86/Ivysaur.png",
            "Grass",
            "Poison",
            "Kanto"
        ),
        Pokemon(
            "075",
            "Venusaur",
            "https://static.wikia.nocookie.net/pokemongo/images/b/be/Venusaur.png",
            "Grass",
            "Poison",
            "Kanto"
        ),
        Pokemon(
            "076",
            "Charmander",
            "https://static.wikia.nocookie.net/pokemongo/images/5/56/Charmander.png",
            "Fire",
            "",
            "Kanto"
        ),
        Pokemon(
            "077",
            "Charmeleon",
            "https://static.wikia.nocookie.net/pokemongo/images/f/fb/Charmeleon.png",
            "Fire",
            "",
            "Kanto"
        ),
        Pokemon(
            "078",
            "Charizard",
            "https://static.wikia.nocookie.net/pokemongo/images/9/95/Charizard.png",
            "Fire",
            "Flying",
            "Kanto"
        ),
        Pokemon(
            "079",
            "Squirtle",
            "https://static.wikia.nocookie.net/pokemongo/images/e/e3/Squirtle.png",
            "Water",
            "",
            "Kanto"
        ),
        Pokemon(
            "080",
            "Wartortle",
            "https://static.wikia.nocookie.net/pokemongo/images/d/d7/Wartortle.png",
            "Water",
            "",
            "Kanto"
        ),
        Pokemon(
            "081",
            "Blastoise",
            "https://static.wikia.nocookie.net/pokemongo/images/4/41/Blastoise.png",
            "Water",
            "",
            "Kanto"
        )
    )
}
//Hasta el 735