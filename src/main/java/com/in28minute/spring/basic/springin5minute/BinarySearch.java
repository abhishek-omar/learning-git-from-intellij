package com.in28minute.spring.basic.springin5minute;

import org.springframework.beans.factory.annotation.Autowired;

public class BinarySearch
{
    public int search(int[] array, int element)
    {
        int st,en,mid;
        st = 0;
        en = array.length -1 ;
        while (st<en)
        {
            mid = (st+en)/2;
            if(array[mid] == element)
            {
                return mid;
            }
            else if (array[mid] < element)
            {
                en = mid - 1;
            }
            else
            {
                st = mid + 1;
            }
        }
        return -1;
    }
}
