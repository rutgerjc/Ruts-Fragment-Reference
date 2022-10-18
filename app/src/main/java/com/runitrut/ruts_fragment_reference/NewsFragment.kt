package com.runitrut.ruts_fragment_reference

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/*DELETE all that extra mumbo jumbo, whats important RN is
 class SportsFragment : Fragment() {}....THEN add the corresponding XML file NAME as a parameter to Fragment() like this
 class SportsFragment : Fragment(R.layout.fragment_news) {}
 Now they're linked
*/

class NewsFragment : Fragment(R.layout.fragment_news) {

}