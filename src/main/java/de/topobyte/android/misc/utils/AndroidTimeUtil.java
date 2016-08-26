// Copyright 2016 Sebastian Kuerten
//
// This file is part of misc-utils.
//
// misc-utils is free software: you can redistribute it and/or modify
// it under the terms of the GNU Lesser General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// misc-utils is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
// GNU Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public License
// along with misc-utils. If not, see <http://www.gnu.org/licenses/>.

package de.topobyte.android.misc.utils;

import android.util.Log;

import java.util.HashMap;
import java.util.Map;

public class AndroidTimeUtil {

	/*
   * Utility: time measuring
	 */

  // here we store times
  private static Map<String, Long> times = new HashMap<>();

  /**
   * Associate the current time with the identifier 'key'
   */
  public static void time(String key)
  {
    times.put(key, System.currentTimeMillis());
  }

  /**
   * Log the time passed in milliseconds since you called time(key).
   */
  public static void time(String key, String logKey, String message)
  {
    long stop = System.currentTimeMillis();
    long start = times.get(key);
    long interval = stop - start;
    Log.i(logKey, String.format(message, interval));
  }

}
