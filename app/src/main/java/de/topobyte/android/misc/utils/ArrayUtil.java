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

import java.lang.reflect.Array;

public class ArrayUtil {

  public static <T> T[] copyOf(T[] array)
  {
    if (array == null) {
      return null;
    }

    @SuppressWarnings("unchecked")
    T[] copy = (T[]) Array.newInstance(array.getClass().getComponentType(),
        array.length);
    System.arraycopy(array, 0, copy, 0, array.length);
    return copy;
  }

  public static <T> T[] copyOfRange(T[] array, int from, int to)
  {
    if (array == null) {
      return null;
    }

    int size = to - from;
    @SuppressWarnings("unchecked")
    T[] copy = (T[]) Array.newInstance(array.getClass().getComponentType(),
        size);
    System.arraycopy(array, from, copy, 0, size);
    return copy;
  }

  public static <T> void reverse(T[] array)
  {
    if (array == null) {
      return;
    }
    int i = 0;
    int j = array.length - 1;
    T tmp;
    while (j > i) {
      tmp = array[j];
      array[j] = array[i];
      array[i] = tmp;
      j--;
      i++;
    }
  }

}
