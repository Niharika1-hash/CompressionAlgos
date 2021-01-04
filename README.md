# LZW-Encoding
INPUT: A .txt file containing some text (letters, special characters, linespces, whitespaces etc) that one wishes to encode using LZW technique. The file path/file location must be known.

OUTPUT: The encoded version of the text input from the input file and total time taken for the encoding operation in nanoseconds.

The IDE used is Eclipse 2020-03. The required sub-packages/sub-directories are a part of the java's default package itself.

Data Structures used:

Hash Table to maintain the crucial dictionary for LZW Algorithm ( Implemented using HashMap class belonging to java.util, also known as Java's Collection Framework)

Array to save the encoded values on the go (Implemented using Vector class belonging to java.util, also known as Java's Collection Framework)
