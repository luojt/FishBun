package com.sangcomz.fishbun.ui.detail.model

import android.net.Uri

interface DetailImageRepository {
    fun getPickerImage(index: Int): Uri?
    fun getPickerImages(): List<Uri>
    fun getSelectedImageList(): List<Uri>
    fun selectImage(imageUri: Uri)
    fun unselectImage(imageUri: Uri)
    fun isFullSelected(): Boolean
    fun checkForFinish(): Boolean
    fun getMessageLimitReached(): String
    fun getMaxCount(): Int
    fun getDetailPickerViewData(): DetailImageViewData
}