package com.example.code_name_teddy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentTransaction
import androidx.lifecycle.ViewModelProvider
import com.example.code_name_teddy.databinding.ActivityMainBinding
import com.example.code_name_teddy.goal.GoalFragment
import com.example.code_name_teddy.play.PlayFragment
import com.example.code_name_teddy.room_database.*
import com.example.code_name_teddy.word.WordFragment

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var viewModel: MainActivityViewModel

    private val wordSetDB1 by lazy { getAppDatabase(applicationContext).wordSetDao1() }
    private val wordSetDB2 by lazy { getAppDatabase(applicationContext).wordSetDao2() }
    private val wordSetDB3 by lazy { getAppDatabase(applicationContext).wordSetDao3() }
    private val wordSetDB4 by lazy { getAppDatabase(applicationContext).wordSetDao4() }
    private val wordSetDB5 by lazy { getAppDatabase(applicationContext).wordSetDao5() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[MainActivityViewModel::class.java]


        showMainFragment()
        getWordSetDatabase()
    }

    private fun getWordSetDatabase() {
        Thread {
            viewModel.wordList1.addAll(wordSetDB1.getAll().map { it.word })
            viewModel.wordList2.addAll(wordSetDB2.getAll().map { it.word })
            viewModel.wordList3.addAll(wordSetDB3.getAll().map { it.word })
            viewModel.wordList4.addAll(wordSetDB4.getAll().map { it.word })
            viewModel.wordList5.addAll(wordSetDB5.getAll().map { it.word })
        }.start()
    }

    fun dbInsertWord(dbNum: Int, word: String) {
        when(dbNum) {
            1 -> { wordSetDB1.insert(WordSet1(word)) }
            2 -> { wordSetDB2.insert(WordSet2(word)) }
            3 -> { wordSetDB3.insert(WordSet3(word)) }
            4 -> { wordSetDB4.insert(WordSet4(word)) }
            5 -> { wordSetDB5.insert(WordSet5(word)) }
        }
    }

    fun dbDeleteWord(dbNum: Int, word: String) {
        when(dbNum) {
            1 -> { wordSetDB1.delete(WordSet1(word)) }
            2 -> { wordSetDB2.delete(WordSet2(word)) }
            3 -> { wordSetDB3.delete(WordSet3(word)) }
            4 -> { wordSetDB4.delete(WordSet4(word)) }
            5 -> { wordSetDB5.delete(WordSet5(word)) }
        }
    }



    private fun showMainFragment() {
        supportFragmentManager.beginTransaction().setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
            .replace(R.id.fragment_container, MainFragment()).commit()
    }

    fun showGoalFragment() {
        supportFragmentManager.beginTransaction().setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
            .replace(R.id.fragment_container, GoalFragment()).addToBackStack(null).commit()
    }

    fun showWordFragment() {
        supportFragmentManager.beginTransaction().setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
            .replace(R.id.fragment_container, WordFragment()).addToBackStack(null).commit()
    }

    fun showPlayFragment() {
        supportFragmentManager.beginTransaction().setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
            .replace(R.id.fragment_container, PlayFragment()).addToBackStack(null).commit()
    }
}