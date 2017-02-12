#Programming in Java

## Statement
For those two assignments, we will be writing one program in Java in two phases. You have decided to write a better ipod shuffle program. Currently it either gives you the same songs each time through or gets stuck on the same artist even when there are multiple artists to choose from. You will want to have information about the artist, the album, the song title, and playlist(s) that the song is part of. Consider supporting different types of audio files (e.g., to allow for dynamic binding), such as music, books on tape, or ringtones (you can modify this list to suite your own interests). Your program won’t be literally playing songs, but it should allow the user to add a new song, remove a song or artist, display the song-list when shuffling a playlist, and edit a playlist.
For Program #4, create the collection of songs (add a song, remove a song) and work on the shuffling algorithm. The grader will need to see that you have made progress with the shuffle algorithm. 

For Program #5, create the ability to have playlists of songs and edit the playlist. This is where the shuffle will need to be fully functional.
The use of external data file is advisable but not required.##Data StructuresIn these last two programs, you must implement these data structures:1. Program #4, Song collection: A **binary search tree (BST)** where each node has a linear linked list of an artist’s songs. Implement a comprehensive setof functions (insert, retrieve, display, and remove an item)2. Program #5, Playlists: Each playlist is a **linear linked list** where each node has a pointer (or reference) to the actual song (do not copy the songs over and over...). (You are allowed to make this a LLL of arrays if it works better withyour shuffle algorithm)
The required data structures specified in the assignment must be your own implementation: as in BSTs and linked lists. It is expected that your BST code be written recursively. Once you meet the basic requirements of the assignment, you are allowed to use libraries for any subsequent data structures.
