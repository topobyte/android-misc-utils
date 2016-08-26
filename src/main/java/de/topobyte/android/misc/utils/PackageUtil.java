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

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;

public class PackageUtil {

  public static boolean isPackageInstalled(Context context, String packageName)
  {
    PackageManager pm = context.getPackageManager();
    boolean installed;
    try {
      /* ApplicationInfo ai = */
      pm.getApplicationInfo(packageName, 0);
      installed = true;
    } catch (NameNotFoundException e) {
      installed = false;
    }
    return installed;
  }

}
