package com.example.dotaapp

import com.google.gson.annotations.SerializedName

data class Response(

	@field:SerializedName("first_blood_time")
	val firstBloodTime: Double? = null,

	@field:SerializedName("cluster")
	val cluster: Double? = null,

	@field:SerializedName("match_seq_num")
	val matchSeqNum: Long? = null,

	@field:SerializedName("replay_salt")
	val replaySalt: Double? = null,

	@field:SerializedName("human_players")
	val humanPlayers: Double? = null,

	@field:SerializedName("series_type")
	val seriesType: Double? = null,

	@field:SerializedName("barracks_status_radiant")
	val barracksStatusRadiant: Double? = null,

	@field:SerializedName("cosmetics")
	val cosmetics: Any? = null,

	@field:SerializedName("duration")
	val duration: Double? = null,

	@field:SerializedName("patch")
	val patch: Double? = null,

	@field:SerializedName("radiant_win")
	val radiantWin: Boolean? = null,

	@field:SerializedName("radiant_xp_adv")
	val radiantXpAdv: Any? = null,

	@field:SerializedName("engine")
	val engine: Double? = null,

	@field:SerializedName("skill")
	val skill: Double? = null,

	@field:SerializedName("negative_votes")
	val negativeVotes: Double? = null,

	@field:SerializedName("picks_bans")
	val picksBans: List<PicksBansItem?>? = null,

	@field:SerializedName("dire_team_id")
	val direTeamId: Any? = null,

	@field:SerializedName("replay_url")
	val replayUrl: String? = null,

	@field:SerializedName("tower_status_radiant")
	val towerStatusRadiant: Double? = null,

	@field:SerializedName("teamfights")
	val teamfights: Any? = null,

	@field:SerializedName("players")
	val players: List<PlayersItem?>? = null,

	@field:SerializedName("match_id")
	val matchId: Long? = null,

	@field:SerializedName("lobby_type")
	val lobbyType: Double? = null,

	@field:SerializedName("version")
	val version: Any? = null,

	@field:SerializedName("series_id")
	val seriesId: Double? = null,

	@field:SerializedName("start_time")
	val startTime: Double? = null,

	@field:SerializedName("draft_timings")
	val draftTimings: Any? = null,

	@field:SerializedName("chat")
	val chat: Any? = null,

	@field:SerializedName("leagueid")
	val leagueid: Double? = null,

	@field:SerializedName("dire_score")
	val direScore: Double? = null,

	@field:SerializedName("game_mode")
	val gameMode: Double? = null,

	@field:SerializedName("positive_votes")
	val positiveVotes: Double? = null,

	@field:SerializedName("radiant_score")
	val radiantScore: Double? = null,

	@field:SerializedName("radiant_team_id")
	val radiantTeamId: Any? = null,

	@field:SerializedName("tower_status_dire")
	val towerStatusDire: Double? = null,

	@field:SerializedName("objectives")
	val objectives: Any? = null,

	@field:SerializedName("barracks_status_dire")
	val barracksStatusDire: Double? = null,

	@field:SerializedName("region")
	val region: Double? = null,

	@field:SerializedName("radiant_gold_adv")
	val radiantGoldAdv: Any? = null
)

data class PicksBansItem(

	@field:SerializedName("hero_id")
	val heroId: Double? = null,

	@field:SerializedName("team")
	val team: Double? = null,

	@field:SerializedName("is_pick")
	val isPick: Boolean? = null,

	@field:SerializedName("order")
	val order: Double? = null
)

data class PlayersItem(

	@field:SerializedName("obs")
	val obs: Any? = null,

	@field:SerializedName("cluster")
	val cluster: Double? = null,

	@field:SerializedName("net_worth")
	val netWorth: Double? = null,

	@field:SerializedName("performance_others")
	val performanceOthers: Any? = null,

	@field:SerializedName("gold_spent")
	val goldSpent: Double? = null,

	@field:SerializedName("obs_left_log")
	val obsLeftLog: Any? = null,

	@field:SerializedName("runes")
	val runes: Any? = null,

	@field:SerializedName("obs_log")
	val obsLog: Any? = null,

	@field:SerializedName("patch")
	val patch: Double? = null,

	@field:SerializedName("item_uses")
	val itemUses: Any? = null,

	@field:SerializedName("pings")
	val pings: Any? = null,

	@field:SerializedName("deaths")
	val deaths: Double? = null,

	@field:SerializedName("purchase_log")
	val purchaseLog: Any? = null,

	@field:SerializedName("gold_per_min")
	val goldPerMin: Double? = null,

	@field:SerializedName("last_login")
	val lastLogin: String? = null,

	@field:SerializedName("lose")
	val lose: Double? = null,

	@field:SerializedName("party_size")
	val partySize: Double? = null,

	@field:SerializedName("kda")
	val kda: Double? = null,

	@field:SerializedName("lane_pos")
	val lanePos: Any? = null,

	@field:SerializedName("kills_per_min")
	val killsPerMin: Double? = null,

	@field:SerializedName("xp_reasons")
	val xpReasons: Any? = null,

	@field:SerializedName("multi_kills")
	val multiKills: Any? = null,

	@field:SerializedName("kills_log")
	val killsLog: Any? = null,

	@field:SerializedName("rune_pickups")
	val runePickups: Any? = null,

	@field:SerializedName("actions")
	val actions: Any? = null,

	@field:SerializedName("damage")
	val damage: Any? = null,

	@field:SerializedName("lh_t")
	val lhT: Any? = null,

	@field:SerializedName("repicked")
	val repicked: Any? = null,

	@field:SerializedName("gold_t")
	val goldT: Any? = null,

	@field:SerializedName("additional_units")
	val additionalUnits: Any? = null,

	@field:SerializedName("randomed")
	val randomed: Any? = null,

	@field:SerializedName("gold")
	val gold: Double? = null,

	@field:SerializedName("radiant_win")
	val radiantWin: Boolean? = null,

	@field:SerializedName("camps_stacked")
	val campsStacked: Any? = null,

	@field:SerializedName("runes_log")
	val runesLog: Any? = null,

	@field:SerializedName("sen")
	val sen: Any? = null,

	@field:SerializedName("roshans_killed")
	val roshansKilled: Any? = null,

	@field:SerializedName("match_id")
	val matchId: Long? = null,

	@field:SerializedName("stuns")
	val stuns: Any? = null,

	@field:SerializedName("account_id")
	val accountId: Double? = null,

	@field:SerializedName("leaver_status")
	val leaverStatus: Double? = null,

	@field:SerializedName("hero_healing")
	val heroHealing: Double? = null,

	@field:SerializedName("max_hero_hit")
	val maxHeroHit: Any? = null,

	@field:SerializedName("killed_by")
	val killedBy: Any? = null,

	@field:SerializedName("game_mode")
	val gameMode: Double? = null,

	@field:SerializedName("item_neutral")
	val itemNeutral: Double? = null,

	@field:SerializedName("obs_placed")
	val obsPlaced: Any? = null,

	@field:SerializedName("total_xp")
	val totalXp: Double? = null,

	@field:SerializedName("gold_reasons")
	val goldReasons: Any? = null,

	@field:SerializedName("personaname")
	val personaname: String? = null,

	@field:SerializedName("is_contributor")
	val isContributor: Boolean? = null,

	@field:SerializedName("damage_inflictor_received")
	val damageInflictorReceived: Any? = null,

	@field:SerializedName("damage_inflictor")
	val damageInflictor: Any? = null,

	@field:SerializedName("total_gold")
	val totalGold: Double? = null,

	@field:SerializedName("buyback_log")
	val buybackLog: Any? = null,

	@field:SerializedName("kill_streaks")
	val killStreaks: Any? = null,

	@field:SerializedName("hero_hits")
	val heroHits: Any? = null,

	@field:SerializedName("xp_per_min")
	val xpPerMin: Double? = null,

	@field:SerializedName("benchmarks")
	val benchmarks: Benchmarks? = null,

	@field:SerializedName("towers_killed")
	val towersKilled: Any? = null,

	@field:SerializedName("level")
	val level: Double? = null,

	@field:SerializedName("abandons")
	val abandons: Double? = null,

	@field:SerializedName("player_slot")
	val playerSlot: Double? = null,

	@field:SerializedName("damage_taken")
	val damageTaken: Any? = null,

	@field:SerializedName("start_time")
	val startTime: Double? = null,

	@field:SerializedName("last_hits")
	val lastHits: Double? = null,

	@field:SerializedName("ability_uses")
	val abilityUses: Any? = null,

	@field:SerializedName("item_5")
	val item5: Double? = null,

	@field:SerializedName("item_4")
	val item4: Double? = null,

	@field:SerializedName("item_3")
	val item3: Double? = null,

	@field:SerializedName("name")
	val name: Any? = null,

	@field:SerializedName("item_2")
	val item2: Double? = null,

	@field:SerializedName("item_1")
	val item1: Double? = null,

	@field:SerializedName("creeps_stacked")
	val creepsStacked: Any? = null,

	@field:SerializedName("item_0")
	val item0: Double? = null,

	@field:SerializedName("region")
	val region: Double? = null,

	@field:SerializedName("kills")
	val kills: Double? = null,

	@field:SerializedName("hero_damage")
	val heroDamage: Double? = null,

	@field:SerializedName("backpack_3")
	val backpack3: Any? = null,

	@field:SerializedName("backpack_1")
	val backpack1: Double? = null,

	@field:SerializedName("backpack_2")
	val backpack2: Double? = null,

	@field:SerializedName("damage_targets")
	val damageTargets: Any? = null,

	@field:SerializedName("denies")
	val denies: Double? = null,

	@field:SerializedName("backpack_0")
	val backpack0: Double? = null,

	@field:SerializedName("life_state")
	val lifeState: Any? = null,

	@field:SerializedName("cosmetics")
	val cosmetics: List<Any?>? = null,

	@field:SerializedName("dn_t")
	val dnT: Any? = null,

	@field:SerializedName("duration")
	val duration: Double? = null,

	@field:SerializedName("permanent_buffs")
	val permanentBuffs: List<PermanentBuffsItem?>? = null,

	@field:SerializedName("times")
	val times: Any? = null,

	@field:SerializedName("assists")
	val assists: Double? = null,

	@field:SerializedName("tower_damage")
	val towerDamage: Double? = null,

	@field:SerializedName("xp_t")
	val xpT: Any? = null,

	@field:SerializedName("rank_tier")
	val rankTier: Double? = null,

	@field:SerializedName("connection_log")
	val connectionLog: Any? = null,

	@field:SerializedName("isRadiant")
	val isRadiant: Boolean? = null,

	@field:SerializedName("hero_id")
	val heroId: Double? = null,

	@field:SerializedName("win")
	val win: Double? = null,

	@field:SerializedName("pred_vict")
	val predVict: Any? = null,

	@field:SerializedName("sen_log")
	val senLog: Any? = null,

	@field:SerializedName("sen_left_log")
	val senLeftLog: Any? = null,

	@field:SerializedName("purchase")
	val purchase: Any? = null,

	@field:SerializedName("lobby_type")
	val lobbyType: Double? = null,

	@field:SerializedName("ability_targets")
	val abilityTargets: Any? = null,

	@field:SerializedName("killed")
	val killed: Any? = null,

	@field:SerializedName("sen_placed")
	val senPlaced: Any? = null,

	@field:SerializedName("ability_upgrades_arr")
	val abilityUpgradesArr: List<Double?>? = null,

	@field:SerializedName("firstblood_claimed")
	val firstbloodClaimed: Any? = null,

	@field:SerializedName("party_id")
	val partyId: Double? = null,

	@field:SerializedName("teamfight_participation")
	val teamfightParticipation: Any? = null
)

data class XpPerMin(

	@field:SerializedName("pct")
	val pct: Double? = null,

	@field:SerializedName("raw")
	val raw: Double? = null
)

data class StunsPerMin(

	@field:SerializedName("pct")
	val pct: Double? = null,

	@field:SerializedName("raw")
	val raw: Double? = null
)

data class HeroDamagePerMin(

	@field:SerializedName("pct")
	val pct: Double? = null,

	@field:SerializedName("raw")
	val raw: Double? = null
)

data class LastHitsPerMin(

	@field:SerializedName("pct")
	val pct: Double? = null,

	@field:SerializedName("raw")
	val raw: Double? = null
)

data class GoldPerMin(

	@field:SerializedName("pct")
	val pct: Double? = null,

	@field:SerializedName("raw")
	val raw: Double? = null
)

data class Lhten(
	val any: Any? = null
)

data class PermanentBuffsItem(

	@field:SerializedName("permanent_buff")
	val permanentBuff: Double? = null,

	@field:SerializedName("stack_count")
	val stackCount: Double? = null
)

data class Benchmarks(

	@field:SerializedName("gold_per_min")
	val goldPerMin: GoldPerMin? = null,

	@field:SerializedName("lhten")
	val lhten: Lhten? = null,

	@field:SerializedName("tower_damage")
	val towerDamage: TowerDamage? = null,

	@field:SerializedName("last_hits_per_min")
	val lastHitsPerMin: LastHitsPerMin? = null,

	@field:SerializedName("hero_damage_per_min")
	val heroDamagePerMin: HeroDamagePerMin? = null,

	@field:SerializedName("stuns_per_min")
	val stunsPerMin: StunsPerMin? = null,

	@field:SerializedName("xp_per_min")
	val xpPerMin: XpPerMin? = null,

	@field:SerializedName("hero_healing_per_min")
	val heroHealingPerMin: HeroHealingPerMin? = null,

	@field:SerializedName("kills_per_min")
	val killsPerMin: KillsPerMin? = null
)

data class KillsPerMin(

	@field:SerializedName("pct")
	val pct: Double? = null,

	@field:SerializedName("raw")
	val raw: Double? = null
)

data class HeroHealingPerMin(

	@field:SerializedName("pct")
	val pct: Double? = null,

	@field:SerializedName("raw")
	val raw: Double? = null
)

data class TowerDamage(

	@field:SerializedName("pct")
	val pct: Double? = null,

	@field:SerializedName("raw")
	val raw: Double? = null
)
