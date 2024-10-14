package lat.pam.scoreteam

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScoreViewModel : ViewModel() {
    // Menggunakan MutableLiveData untuk menyimpan nilai skor
    private val _scoreA = MutableLiveData<Int>().apply { value = 0 }
    val scoreA: LiveData<Int> get() = _scoreA // Menggunakan LiveData agar UI dapat mengamatinya

    // Metode untuk menambah skor
    fun addScoreA() {
        _scoreA.value = (_scoreA.value ?: 0) + 1 // Menambah skor dengan menghindari NullPointerException
    }
}
