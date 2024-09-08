package com.example.retrofittest

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AlbumViewModel @Inject constructor(private val apiService: apiservice) : ViewModel() {
    val AlbumList = MutableLiveData<List<album>>()
    val albumlist: LiveData<List<album>> = AlbumList
    fun getalbums(){
        viewModelScope.launch {
            val response = apiService.getalbum()
            AlbumList.postValue(response)
        }
    }
}