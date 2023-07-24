import scala.io.StdIn
object CaesarCipher extends App{

    val alphabet = List('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
      'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z')

    def encrypt(text: String, shift: Int): String = {
      //map each character of the string
      val encryptedText = text.map(c => {
        if (c.isLetter) {
          val index = alphabet.indexOf(c)
          val newIndex = (index + shift) % alphabet.size
          alphabet(newIndex)
        }
        else {
          c
        }
      })
      encryptedText.mkString("")
    }

  def decrypt(text: String, shift: Int): String = {
    val decryptedText = text.map(c => {
      if (c.isLetter) {
        val index = alphabet.indexOf(c)
        val newIndex = (index - shift + alphabet.size) % alphabet.size
        alphabet(newIndex)
      } else {
        c
      }
    })
    decryptedText.mkString("")
  }

  def cipher(text: String, shift: Int, process: (String, Int) => String): String = {
    process(text, shift)
  }

  println("Enter the Text:")
  val text = StdIn.readLine()
  println("Enter the shift value:")
  val shift = StdIn.readInt()

  val encryptedText = cipher(text, shift, encrypt)
  printf("Encrypted text: %s \n", encryptedText)

  val decryptedText = cipher(encryptedText, shift, decrypt)
  printf("Decrypted text: %s", decryptedText)


}
