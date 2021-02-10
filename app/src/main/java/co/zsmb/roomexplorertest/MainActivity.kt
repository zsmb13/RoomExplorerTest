package co.zsmb.roomexplorertest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.RoomDatabase
import com.wajahatkarim3.roomexplorer.RoomExplorer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        RoomExplorer.show(this, RoomDatabase::class.java, "db")
    }
}
