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
import android.widget.Toast;

public class Toaster {

  private static Toast toast = null;

  private Context context;

  public Toaster(Context context)
  {
    this.context = context;
  }

  public void toastShort(String text)
  {
    toast(text, Toast.LENGTH_SHORT);
  }

  public void toastLong(String text)
  {
    toast(text, Toast.LENGTH_LONG);
  }

  public void cancel()
  {
    if (toast != null) {
      toast.cancel();
    }
  }

  private void toast(String text, int duration)
  {
    if (toast == null) {
      toast = Toast.makeText(context, text, duration);
    } else {
      toast.setDuration(duration);
      toast.setText(text);
    }
    toast.show();
  }

}
