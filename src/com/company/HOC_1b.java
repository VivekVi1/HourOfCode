/*
An online book reading community's grid displays books in a specific format. Only one batch of books is displayed at a time and
each batch of books is recognized as a string tagged a-z. Each character of the string denotes the initials of the book's author. The
Got any questions? I'm happy to
help.

community has decided to change the format of the display grid but before they can do this, they need to know the number of
unique author's initials present in the given batch of books. The unique author's initials are the initials that appear only once in the
batch of books represented as a string.
Write an algorithm to help the community find the count of unique author's initials present in the given batch of books.
Note
The batch of books contains only the lowercase letters as the author name initial.
Example
Input
asfddagha
Output
4
Explanation
There are 4 unique characters (s, g, g, h) present in the string. Hence the output is 4.
*/

/*Solution*/

package com.company;

public class HOC_1b {
    static int uniqueAuthor(String str) {
        char []arr = str.toCharArray();
        int count = 0;
        int []freq = new int[255];
        for(int i = 0; i < str.length(); i++)
            freq[arr[i]]++;
        for(int i = 0; i < 255; i++)
        {
            if(freq[i] == 1)
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String batch="HelloWorld";
        System.out.println(uniqueAuthor(batch));
    }
}
