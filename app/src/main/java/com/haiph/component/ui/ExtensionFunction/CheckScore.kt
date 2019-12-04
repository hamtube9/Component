package com.haiph.component.ui.ExtensionFunction

 class CheckScore{

    fun checkScoreLessThanFive(score : Int): Boolean {
        return score <= 5
    }


    fun checkScoreMoreThanFive(score: Int): Boolean {
        return score > 5
    }
}