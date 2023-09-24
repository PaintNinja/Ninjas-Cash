ModsDotGroovy.make {
    modLoader = 'javafml'
    loaderVersion = '[48,)'

    license = 'MIT'
    issueTrackerUrl = 'https://github.com/PaintNinja/Ninjas-Cash/issues'

    mod {
        modId = 'ninjascash'
        displayName = "Ninja's Cash"
        description = "Ninja's Cash is a mod that adds a physical currency to the game. It allows servers to use mods such as the Vending mod whilst still allowing players to buy stuff using the server's economy rather than normal items."
        version = '1.20.2-2.7.0'

        author = 'Paint_Ninja'

        displayUrl = 'https://www.curseforge.com/minecraft/mc-mods/ninjas-cash'

        dependencies {
            forge = '>=48.0.6'
            minecraft = '>=1.20.2'
        }
    }
}
