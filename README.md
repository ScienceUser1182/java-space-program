In this project, you are a Pirate ship traveling through space on a quote-unquote 'Cargoship'. This program uses advanced Object-Oriented Programming in Java via ArrayList. 
This is what the program looks at upon loading:

Welcome to the BlackStar Cargo Hold interface.
Please select a number from the options below:

1: Add an item to the cargo hold.
2: Remove an item from the cargo hold.
3: Sort the contents of the cargo hold.
4: Search for an item.
5: Display the items in the ship hold.
6: Decode intercepted message
7: Unload/load items
8: Ransack an item
0: Exit the BlackStar Cargo Hold interface.

This code is PARTICULARLY impressive in its Decoding of intercepted messages:
It uses a brute-force decryption tool specifically designed to crack a Caesar cipher with a slight twist:
it uses two different shift keys, one for characters at even positions and another for characters at odd positions within the ciphertext.
It tries every possible combination of two Caesar cipher keys (one for even-indexed characters and one for odd-indexed characters) 
and checks if the resulting decryption starts with "Gr". It's adjustable, which is what makes it so powerful...
Of course, I've done loads of password Cracking with Hashcat on Linux before, so...

I still wish I got a 'back' component on the hold installed... I'm sure I'll figure it out soon.
