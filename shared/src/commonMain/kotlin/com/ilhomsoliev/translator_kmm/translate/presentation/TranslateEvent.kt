package com.ilhomsoliev.translator_kmm.translate.presentation

import com.ilhomsoliev.translator_kmm.core.presentation.UiLanguage
import com.ilhomsoliev.translator_kmm.translate.domain.translate.Translate

sealed class TranslateEvent() {
    data class ChooseFromLanguage(val language: UiLanguage) : TranslateEvent()
    data class ChooseToLanguage(val language: UiLanguage) : TranslateEvent()
    object StopChoosingLanguage : TranslateEvent()
    object SwapLanguages : TranslateEvent()
    data class ChangeTranslationText(val text: String) : TranslateEvent()
    object Translate : TranslateEvent()
    object OpenFromLanguageDropDown : TranslateEvent()
    object OpenToLanguageDropDown : TranslateEvent()
    object CloseTranslation : TranslateEvent()
    data class SelectHistoryItem(val item: UiHistoryItem) : TranslateEvent()
    object EditTranslation : TranslateEvent()
    object RecordAudio : TranslateEvent()
    data class SubmitVoiceResult(val result: String?) : TranslateEvent()
    data class DeleteHistory(val id: Long) : TranslateEvent()

    object OnErrorSeen : TranslateEvent()

}