package com.example.repository

import com.example.model.ApiResponse
import com.example.model.Hero


const val NEXT_PAGE_KEY = "nextPage"
const val PREVIOUS_PAGE_KEY = "prevPage"


class HeroRepositoryImpl: HeroRepository{

    override val heroes: Map<Int, List<Hero>> by lazy {
        mapOf(
            1 to page1,
            2 to page2,
            3 to page3,
            4 to page4,
            5 to page5
        )
    }



    override val page1 = listOf(
        Hero(
            id = 1,
            name = "Phantom Assassin",
            image = "/images/phantom-assassin.png",
            about = "Phantom Assassin description",
            rating = 10.0,
            position = 1,
            power = listOf("Late Game Queen 1v9","Assassin", "High Physical Damage"),
            comfort = "High",
            pick = listOf("3rd pick or 4th pick", "last pick"),
            abilities = listOf("Stifling Dagger", "Blur", "Coup de Grace", "Coup de Grace"),
            roleTypes = listOf("Carry", "Elusive")
        ),

        Hero(
            id = 2,
            name = "Anti-Mage",
            image = "/images/anti-mage.jpg",
            about = "Anti-Mage description",
            rating = 9.0,
            position = 1,
            power = listOf("Late Game King sometimes 1v9","Assassin"),
            comfort = "High",
            pick = listOf("3rd pick or 4th pick", "last pick"),
            abilities = listOf("Mana Break", "Blink", "Spell Shield", "Mana Void"),
            roleTypes = listOf("Carry", "Elusive")
        ),

        Hero(
            id = 3,
            name = "Naga Siren",
            image = "/images/naga-siren.jpg",
            about = "Naga Siren description",
            rating = 9.9,
            position = 1,
            power = listOf("Tempo Queen","Illusion specialist with map control"),
            comfort = "High",
            pick = listOf("3rd pick or 4th pick", "last pick"),
            abilities = listOf("Mirror Image", "Ensnare", "Riptide", "Song of the Siren"),
            roleTypes = listOf("Carry", "Illusion", "Pusher")
        ),

        Hero(
            id = 4,
            name = "Phantom Lancer",
            image = "/images/phantom-lancer.png",
            about = "Phantom Lancer description",
            rating = 9.9,
            position = 1,
            power = listOf("Late Game King 1v9","Assassin with Illusions"),
            comfort = "High",
            pick = listOf("3rd pick or 4th pick", "last pick"),
            abilities = listOf("Spirit Lance", "Doppelganger", "Phantom Rush", "Juxtapose"),
            roleTypes = listOf("Carry", "Illusion", "Elusive")
        ),

        Hero(
            id = 5,
            name = "Drow Ranger",
            image = "/images/drow-ranger.jpeg",
            about = "Drow Ranger description",
            rating = 8.0,
            position = 1,
            power = listOf("Late Game Queen","High Physical Damage"),
            comfort = "Medium",
            pick = listOf("3rd pick or 4th pick", "last pick"),
            abilities = listOf("Frost Arrows", "Gust", "Multishot", "Marksmanship"),
            roleTypes = listOf("Carry", "Mid", "High Ground Defender", "Stand in the ground")
        ),

        Hero(
            id = 6,
            name = "Juggernaut",
            image = "/images/juggernaut.jpg",
            about = "Juggernaut description",
            rating = 8.2,
            position = 1,
            power = listOf("Burst Ultimate","High Physical Damage"),
            comfort = "Medium",
            pick = listOf("3rd pick or 4th pick", "last pick"),
            abilities = listOf("Blade Fury", "Healing Ward", "Blade Dance", "Omnislash"),
            roleTypes = listOf("Carry", "Mid", "Avatar/Free BKB")
        ),

        Hero(
            id = 7,
            name = "Faceless Void",
            image = "/images/faceless-void.jpg",
            about = "Faceless Void description",
            rating = 8.6,
            position = 1,
            power = listOf("Late Game King sometimes 1v9","Assassin", "AOE Disable"),
            comfort = "High",
            pick = listOf ("3rd pick or 4th pick", "last pick"),
            abilities = listOf("Time Walk", "Time Dilation", "Time Lock", "Chronosphere"),
            roleTypes = listOf("Carry", "Initiator", "Disabler", "Assassin")
        ),

        Hero(
            id = 8,
            name = "Bloodseeker",
            image = "/images/bloodseeker.jpg",
            about = "Bloodseeker description",
            rating = 7.5,
            position = 1,
            power = listOf("Burst Ultimate","Mixed Damage with Pure + Physical"),
            comfort = "Medium",
            pick = listOf ("3rd pick or 4th pick", "last pick"),
            abilities = listOf("Bloodrage", "Blood Rite", "Thirst", "Rupture"),
            roleTypes = listOf("Carry", "Disabler", "Stand in the ground")
        )
    )
    override val page2 = listOf(
        Hero(
            id = 9,
            name = "Bounty Hunter",
            image = "/images/bounty-hunter.jpg",
            about = "Bounty Hunter description",
            rating = 7.0,
            position = 3,
            power = listOf("Scouting Ultimate","High Physical Damage"),
            comfort = "Medium",
            pick = listOf ("3rd pick or 4th pick", "1st pick or second pick"),
            abilities = listOf("Shuriken Toss", "Jinada", "Shadow Walk", "Track"),
            roleTypes = listOf("Escape", "Scout", "Offlaner", "Lane Winner")
        ),

        Hero(
            id = 10,
            name = "Weaver",
            image = "/images/weaver.jpg",
            about = "Weaver description",
            rating = 7.9,
            position = 1,
            power = listOf("Late Game King sometimes 1v9","Assassin", "High Physical Damage"),
            comfort = "Medium",
            pick = listOf ("3rd pick or 4th pick", "last pick"),
            abilities = listOf("The Swarm", "Shukuchi", "Geminate Attack", "Time Lapse"),
            roleTypes = listOf("Carry", "Escape", "Elusive")
        ),

        Hero(
            id = 11,
            name = "Riki",
            image = "/images/riki.jpg",
            about = "Riki description",
            rating = 7.5,
            position = 1,
            power = listOf("Late Game King sometimes 1v9","Assassin", "High Physical Damage"),
            comfort = "Medium",
            pick = listOf ("3rd pick or 4th pick", "last pick"),
            abilities = listOf("Smoke Screen", "Blink Strike", "Cloak and Dagger", "Tricks of the Trade"),
            roleTypes = listOf("Carry", "Escape", "Elusive")
        ),

        Hero(
            id = 12,
            name = "Slark",
            image = "/images/slark.png",
            about = "Slark description",
            rating = 8.0,
            position = 1,
            power = listOf("Mid to Late game tempo","Assassin", "High Physical Damage"),
            comfort = "Medium",
            pick = listOf ("3rd pick or 4th pick", "last pick"),
            abilities = listOf("Dark Pact", "Pounce", "Essence Shift", "Shadow Dance"),
            roleTypes = listOf("Carry", "Escape", "Elusive")
        ),

        Hero(
            id = 13,
            name = "Morphling",
            image = "/images/morphling.png",
            about = "Morphling description",
            rating = 8.5,
            position = 1,
            power = listOf("Late Game King 1v9", "High Burst Damage", "Adaptable"),
            comfort = "High",
            pick = listOf("3rd pick or 4th pick", "last pick"),
            abilities = listOf("Waveform", "Adaptive Strike", "Attribute Shift", "Morph"),
            roleTypes = listOf("Carry", "Escape", "Nuker", "Adaptable")
        ),

        Hero(
            id = 14,
            name = "Spectre",
            image = "/images/spectre.png",
            about = "Spectre description",
            rating = 8.7,
            position = 1,
            power = listOf("Late Game Queen 1v9", "Global Presence", "Tanky Carry"),
            comfort = "Medium",
            pick = listOf("3rd pick or 4th pick", "last pick"),
            abilities = listOf("Spectral Dagger", "Desolate", "Dispersion", "Haunt"),
            roleTypes = listOf("Carry", "Durable", "Global")
        ),

        Hero(
            id = 15,
            name = "Templar Assassin",
            image = "/images/templar-assassin.jpg",
            about = "Templar Assassin description",
            rating = 8.2,
            position = 2,
            power = listOf("High Burst Damage", "Lane Dominator", "Map Control"),
            comfort = "Medium",
            pick = listOf("3rd pick or 4th pick", "last pick"),
            abilities = listOf("Refraction", "Meld", "Psi Blades", "Psionic Trap"),
            roleTypes = listOf("Carry", "Mid", "Assassin")
        ),

        Hero(
            id = 16,
            name = "Troll Warlord",
            image = "/images/troll-warlord.png",
            about = "Troll Warlord description",
            rating = 7.8,
            position = 1,
            power = listOf("Late Game King", "High Physical Damage", "Bash Lord"),
            comfort = "Medium",
            pick = listOf("3rd pick or 4th pick", "last pick"),
            abilities = listOf("Berserker's Rage", "Whirling Axes", "Fervor", "Battle Trance"),
            roleTypes = listOf("Carry", "Pusher", "Disabler")
        )
    )

    override val page3 = listOf(
        Hero(
            id = 17,
            name = "Sven",
            image = "/images/sven.jpg",
            about = "Sven description",
            rating = 7.5,
            position = 1,
            power = listOf("High Cleave Damage", "AOE Stun", "Tanky Carry"),
            comfort = "Medium",
            pick = listOf("3rd pick or 4th pick", "last pick"),
            abilities = listOf("Storm Hammer", "Great Cleave", "Warcry", "God's Strength"),
            roleTypes = listOf("Carry", "Disabler", "Initiator", "Durable")
        ),

        Hero(
            id = 18,
            name = "Lifestealer",
            image = "/images/lifestealer.png",
            about = "Lifestealer description",
            rating = 7.7,
            position = 1,
            power = listOf("Tanky Carry", "High Sustainability", "Anti-Strength"),
            comfort = "Medium",
            pick = listOf("3rd pick or 4th pick", "last pick"),
            abilities = listOf("Rage", "Feast", "Open Wounds", "Infest"),
            roleTypes = listOf("Carry", "Durable", "Jungler", "Escape")
        ),

        Hero(
            id = 19,
            name = "Alchemist",
            image = "/images/alchemist.png",
            about = "Alchemist description",
            rating = 7.6,
            position = 1,
            power = listOf("Fast Farmer", "Early Game Power Spike", "Chemical Rage"),
            comfort = "Medium",
            pick = listOf("3rd pick or 4th pick", "last pick"),
            abilities = listOf("Acid Spray", "Unstable Concoction", "Greevil's Greed", "Chemical Rage"),
            roleTypes = listOf("Carry", "Disabler", "Durable", "Nuker")
        ),

        Hero(
            id = 20,
            name = "Dragon Knight",
            image = "/images/dragon-knight.png",
            about = "Dragon Knight description",
            rating = 7.4,
            position = 2,
            power = listOf("Tanky Mid", "Push Potential", "Stun"),
            comfort = "Medium",
            pick = listOf("1st pick or second pick", "3rd pick or 4th pick"),
            abilities = listOf("Breathe Fire", "Dragon Tail", "Dragon Blood", "Elder Dragon Form"),
            roleTypes = listOf("Carry", "Pusher", "Durable", "Disabler", "Initiator")
        ),

        Hero(
            id = 21,
            name = "Wraith King",
            image = "/images/wraith-king.png",
            about = "Wraith King description",
            rating = 7.8,
            position = 1,
            power = listOf("Tanky Carry", "Second Life", "Reliable Stun"),
            comfort = "Medium",
            pick = listOf("1st pick or second pick", "3rd pick or 4th pick"),
            abilities = listOf("Wraithfire Blast", "Vampiric Spirit", "Mortal Strike", "Reincarnation"),
            roleTypes = listOf("Carry", "Durable", "Disabler", "Initiator")
        ),

        Hero(
            id = 22,
            name = "Muerta",
            image = "/images/muerta.jpg",
            about = "Muerta description",
            rating = 7.5,
            position = 1,
            power = listOf("High Magical Damage", "Anti Physical", "AOE Control"),
            comfort = "Medium",
            pick = listOf("3rd pick or 4th pick", "last pick"),
            abilities = listOf("Dead Shot", "The Calling", "Gunslinger", "Pierce the Veil"),
            roleTypes = listOf("Carry", "Nuker", "Disabler")
        ),

        Hero(
            id = 23,
            name = "Storm Spirit",
            image = "/images/storm-spirit.png",
            about = "Storm Spirit description",
            rating = 8.5,
            position = 2,
            power = listOf("High Mobility", "Burst Damage", "Initiator"),
            comfort = "High",
            pick = listOf("3rd pick or 4th pick", "last pick"),
            abilities = listOf("Static Remnant", "Electric Vortex", "Overload", "Ball Lightning"),
            roleTypes = listOf("Carry", "Escape", "Nuker", "Initiator")
        ),

        Hero(
            id = 24,
            name = "Necrophos",
            image = "/images/necrophos.png",
            about = "Necrophos description",
            rating = 7.7,
            position = 2,
            power = listOf("Sustain", "Magic Damage", "Ultimate Execution"),
            comfort = "Medium",
            pick = listOf("3rd pick or 4th pick", "last pick"),
            abilities = listOf("Death Pulse", "Ghost Shroud", "Heartstopper Aura", "Reaper's Scythe"),
            roleTypes = listOf("Carry", "Nuker", "Durable", "Disabler")
        )
    )

    override val page4 = listOf(
        Hero(
            id = 25,
            name = "Queen of Pain",
            image = "/images/queen-of-pain.png",
            about = "Queen of Pain description",
            rating = 8.3,
            position = 2,
            power = listOf("High Burst Damage", "Mobility", "Lane Dominator"),
            comfort = "Medium",
            pick = listOf("3rd pick or 4th pick", "last pick"),
            abilities = listOf("Shadow Strike", "Blink", "Scream of Pain", "Sonic Wave"),
            roleTypes = listOf("Carry", "Nuker", "Escape")
        ),

        Hero(
            id = 26,
            name = "Windranger",
            image = "/images/windranger.jpg",
            about = "Windranger description",
            rating = 7.8,
            position = 1,
            power = listOf("Single Target Lockdown", "High Physical Damage", "Escape"),
            comfort = "Medium",
            pick = listOf("3rd pick or 4th pick", "last pick"),
            abilities = listOf("Shackleshot", "Powershot", "Windrun", "Focus Fire"),
            roleTypes = listOf("Carry", "Support", "Disabler", "Escape", "Nuker")
        ),

        Hero(
            id = 27,
            name = "Void Spirit",
            image = "/images/void-spirit.jpg",
            about = "Void Spirit description",
            rating = 8.1,
            position = 2,
            power = listOf("High Mobility", "Burst Damage", "Elusive"),
            comfort = "Medium",
            pick = listOf("3rd pick or 4th pick", "last pick"),
            abilities = listOf("Aether Remnant", "Dissimilate", "Resonant Pulse", "Astral Step"),
            roleTypes = listOf("Carry", "Escape", "Nuker", "Disabler")
        ),

        Hero(
            id = 28,
            name = "Lycan",
            image = "/images/lycan.jpg",
            about = "Lycan description",
            rating = 7.6,
            position = 1,
            power = listOf("Push Potential", "High Physical Damage", "Summons"),
            comfort = "Medium",
            pick = listOf("3rd pick or 4th pick", "last pick"),
            abilities = listOf("Summon Wolves", "Howl", "Feral Impulse", "Shapeshift"),
            roleTypes = listOf("Carry", "Pusher", "Jungler", "Durable")
        ),

        Hero(
            id = 29,
            name = "Abaddon",
            image = "/images/abaddon.jpg",
            about = "Abaddon description",
            rating = 7.5,
            position = 5,
            power = listOf("Tanky", "Support", "Dispel"),
            comfort = "Medium",
            pick = listOf("1st pick or second pick", "3rd pick or 4th pick"),
            abilities = listOf("Mist Coil", "Aphotic Shield", "Curse of Avernus", "Borrowed Time"),
            roleTypes = listOf("Support", "Carry", "Durable")
        ),

        Hero(
            id = 30,
            name = "Dark Seer",
            image = "/images/dark-seer.jpg",
            about = "Dark Seer description",
            rating = 7.7,
            position = 3,
            power = listOf("Teamfight Control", "Farming Acceleration", "Initiator"),
            comfort = "Medium",
            pick = listOf("1st pick or second pick", "3rd pick or 4th pick"),
            abilities = listOf("Vacuum", "Ion Shell", "Surge", "Wall of Replica"),
            roleTypes = listOf("Initiator", "Jungler", "Escape", "Disabler")
        ),

        Hero(
            id = 31,
            name = "Axe",
            image = "/images/axe.jpg",
            about = "Axe description",
            rating = 7.8,
            position = 3,
            power = listOf("Tanky Initiator", "AOE Disable", "Execute Ultimate"),
            comfort = "Medium",
            pick = listOf("1st pick or second pick", "3rd pick or 4th pick"),
            abilities = listOf("Berserker's Call", "Battle Hunger", "Counter Helix", "Culling Blade"),
            roleTypes = listOf("Initiator", "Durable", "Disabler", "Jungler")
        ),

        Hero(
            id = 32,
            name = "Vengeful Spirit",
            image = "/images/vengeful-spirit.jpg",
            about = "Vengeful Spirit description",
            rating = 7.4,
            position = 3,
            power = listOf("Swap Ultimate", "Stun", "Aura"),
            comfort = "Medium",
            pick = listOf("1st pick or second pick", "3rd pick or 4th pick"),
            abilities = listOf("Magic Missile", "Wave of Terror", "Vengeance Aura", "Nether Swap"),
            roleTypes = listOf("Support", "Initiator", "Disabler", "Nuker", "Escape")
        )
    )

    override val page5 = listOf(
        Hero(
            id = 33,
            name = "Chaos Knight",
            image = "/images/chaos-knight.png",
            about = "Chaos Knight description",
            rating = 7.6,
            position = 1,
            power = listOf("High Burst Damage", "Tanky", "Illusions"),
            comfort = "Medium",
            pick = listOf("3rd pick or 4th pick", "last pick"),
            abilities = listOf("Chaos Bolt", "Reality Rift", "Chaos Strike", "Phantasm"),
            roleTypes = listOf("Carry", "Disabler", "Durable", "Initiator")
        ),

        Hero(
            id = 34,
            name = "Legion Commander",
            image = "/images/legion-commander.jpg",
            about = "Legion Commander description",
            rating = 7.9,
            position = 3,
            power = listOf("Duel Ultimate", "Dispel", "Sustainability"),
            comfort = "Medium",
            pick = listOf("3rd pick or 4th pick", "last pick"),
            abilities = listOf("Overwhelming Odds", "Press the Attack", "Moment of Courage", "Duel"),
            roleTypes = listOf("Carry", "Disabler", "Initiator", "Durable", "Nuker")
        ),

        Hero(
            id = 35,
            name = "Spirit Breaker",
            image = "/images/spirit-breaker.jpg",
            about = "Spirit Breaker description",
            rating = 7.5,
            position = 3,
            power = listOf("Global Presence", "Initiator", "Tanky"),
            comfort = "Medium",
            pick = listOf("1st pick or second pick", "3rd pick or 4th pick"),
            abilities = listOf("Charge of Darkness", "Bulldoze", "Greater Bash", "Nether Strike"),
            roleTypes = listOf("Carry", "Initiator", "Disabler", "Durable", "Escape")
        ),

        Hero(
            id = 36,
            name = "Monkey King",
            image = "/images/monkey-king.jpg",
            about = "Monkey King description",
            rating = 8.0,
            position = 1,
            power = listOf("High Mobility", "Versatile", "Strong Laner"),
            comfort = "Medium",
            pick = listOf("3rd pick or 4th pick", "last pick"),
            abilities = listOf("Boundless Strike", "Tree Dance", "Jingu Mastery", "Wukong's Command"),
            roleTypes = listOf("Carry", "Escape", "Disabler", "Initiator")
        ),

        Hero(
            id = 37,
            name = "Dazzle",
            image = "/images/dazzle.jpg",
            about = "Dazzle description",
            rating = 7.4,
            position = 2,
            power = listOf("Heal", "Save", "Armor Reduction"),
            comfort = "Medium",
            pick = listOf("1st pick or second pick", "3rd pick or 4th pick"),
            abilities = listOf("Poison Touch", "Shallow Grave", "Shadow Wave", "Bad Juju"),
            roleTypes = listOf("Support", "Nuker", "Disabler", "Durable")
        ),

        Hero(
            id = 38,
            name = "Gyrocopter",
            image = "/images/gyrocopter.jpg",
            about = "Gyrocopter description",
            rating = 7.3,
            position = 1,
            power = listOf("AOE Damage", "Farming Speed", "Early Game Power"),
            comfort = "Medium",
            pick = listOf("3rd pick or 4th pick", "last pick"),
            abilities = listOf("Rocket Barrage", "Homing Missile", "Flak Cannon", "Call Down"),
            roleTypes = listOf("Carry", "Nuker", "Disabler")
        ),

        Hero(
            id = 39,
            name = "Medusa",
            image = "/images/medusa.jpg",
            about = "Medusa description",
            rating = 8.0,
            position = 1,
            power = listOf("Tanky Carry", "AOE Damage", "Late Game Queen"),
            comfort = "Medium",
            pick = listOf("3rd pick or 4th pick", "last pick"),
            abilities = listOf("Split Shot", "Mystic Snake", "Mana Shield", "Stone Gaze"),
            roleTypes = listOf("Carry", "Durable", "Disabler")
        ),

        Hero(
            id = 40,
            name = "Zeus",
            image = "/images/zeus.jpg",
            about = "Zeus description",
            rating = 7.8,
            position = 2,
            power = listOf("High Magic Damage", "Global Presence", "Vision"),
            comfort = "Medium",
            pick = listOf("3rd pick or 4th pick", "last pick"),
            abilities = listOf("Arc Lightning", "Lightning Bolt", "Static Field", "Thundergod's Wrath"),
            roleTypes = listOf("Nuker", "Carry")
        )
    )

    override suspend fun getAllHeroes(page: Int): ApiResponse {
        return ApiResponse(
            success = true,
            message = "ok",
            prevPage = calculatePage(page = page)[PREVIOUS_PAGE_KEY],
            nextPage = calculatePage(page = page)[NEXT_PAGE_KEY],
            heroes = heroes[page]!!,
            lastUpdated = System.currentTimeMillis()
        )
    }

    private fun calculatePage(page: Int): Map<String, Int?> {
        var prevPage: Int? = page
        var nextPage: Int? = page
        if (page in 1..4) {
            nextPage = nextPage?.plus(1)
        }
        if (page in 2..5) {
            prevPage = prevPage?.minus(1)
        }
        if (page == 1) {
            prevPage = null
        }
        if (page == 5) {
            nextPage = null
        }
        return mapOf(PREVIOUS_PAGE_KEY to prevPage, NEXT_PAGE_KEY to nextPage)
    }

    override suspend fun searchHeroes(name: String?): ApiResponse {
        return ApiResponse(
            success = true,
            message = "ok",
            heroes = findHeroes(query = name)
        )
    }
    private fun findHeroes(query: String?): List<Hero> {
        val founded = mutableListOf<Hero>()
        return if (!query.isNullOrEmpty()) {
            heroes.forEach { (_, heroes) ->
                heroes.forEach { hero ->
                    if (hero.name.lowercase().contains(query.lowercase())) {
                        founded.add(hero)
                    }
                }
            }
            founded
        } else {
            emptyList()
        }
    }
}