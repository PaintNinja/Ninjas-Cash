ModsDotGroovy.make {
    modLoader = 'gml'
    loaderVersion = '[4,)'

    license = 'MIT'
    issueTrackerUrl = 'https://github.com/PaintNinja/Ninjas-Cash/issues'

    mod {
        modId = 'ninjascash'
        displayName = "Ninja's Cash"
        description = "Ninja's Cash is a mod that adds a physical currency to the game. It allows servers to use mods such as the Vending mod whilst still allowing players to buy stuff using the server's economy rather than normal items."
        version = '1.20-2.6.0'

        author = 'Paint_Ninja'

        displayUrl = 'https://www.curseforge.com/minecraft/mc-mods/ninjas-cash'

        dependencies {
            forge = '>=46.0.14'
            minecraft = 20.0..20.9 // allows 1.20.*
            mod {
                modId = 'gml'
                versionRange = '>=4.0.2'
            }
        }
    }
}
