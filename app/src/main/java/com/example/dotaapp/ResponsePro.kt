package com.example.dotaapp

import com.google.gson.annotations.SerializedName

data class ResponsePro(

	@field:SerializedName("ResponsePro")
	val responsePro: List<ResponseProItem?>? = null
)

data class ResponseProItem(

	@field:SerializedName("match_id")
	val matchId: Long? = null,

	@field:SerializedName("league_name")
	val leagueName: String? = null,

	@field:SerializedName("series_type")
	val seriesType: Int? = null,

	@field:SerializedName("series_id")
	val seriesId: Int? = null,

	@field:SerializedName("duration")
	val duration: Int? = null,

	@field:SerializedName("start_time")
	val startTime: Int? = null,

	@field:SerializedName("radiant_name")
	val radiantName: String? = null,

	@field:SerializedName("radiant_win")
	val radiantWin: Boolean? = null,

	@field:SerializedName("dire_name")
	val direName: String? = null,

	@field:SerializedName("leagueid")
	val leagueid: Int? = null,

	@field:SerializedName("dire_score")
	val direScore: Int? = null,

	@field:SerializedName("radiant_team_id")
	val radiantTeamId: Int? = null,

	@field:SerializedName("radiant_score")
	val radiantScore: Int? = null,

	@field:SerializedName("dire_team_id")
	val direTeamId: Int? = null
)
