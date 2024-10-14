package lat.pam.scoreteam

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import lat.pam.scoreteam.databinding.ActivityMainBinding // Import untuk DataBinding
import lat.pam.scoreteam.ScoreViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel = ScoreViewModel() // Inisialisasi ScoreViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        binding.plusOneButtonA.setOnClickListener {
            viewModel.addScoreA()
            binding.invalidateAll() // Memperbarui UI
        }
    }
}
