package net.feminaexlux.utility

import org.abstractj.kalium.NaCl.Sodium
import org.abstractj.kalium.crypto.Password
import org.abstractj.kalium.encoders.Encoder

/**
  * Created by lani on 5/7/17.
  */
object Security {
  val password = new Password

  def HashPassword(rawPassword: String): String = {
    password.hash(rawPassword.getBytes(),
                 Encoder.HEX,
                 Sodium.CRYPTO_PWHASH_SCRYPTSALSA208SHA256_OPSLIMIT_INTERACTIVE,
                 Sodium.CRYPTO_PWHASH_SCRYPTSALSA208SHA256_MEMLIMIT_INTERACTIVE)
  }

  def CheckPassword(rawPassword: String, hashedPassword: String): Boolean = {
    val hashedPasswordBytes = Encoder.HEX.decode(hashedPassword)
    val rawPasswordBytes = rawPassword.getBytes()
    password.verify(hashedPasswordBytes, rawPasswordBytes)
  }
}