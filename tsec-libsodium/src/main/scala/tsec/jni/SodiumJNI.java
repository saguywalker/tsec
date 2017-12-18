/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package tsec.jni;

public class SodiumJNI {
  public final static native int sodium_init();
  public final static native byte[] sodium_version_string();
  public final static native void randombytes(byte[] jarg1, int jarg2);
  public final static native int randombytes_random();
  public final static native int randombytes_uniform(int jarg1);
  public final static native void randombytes_buf(byte[] jarg1, int jarg2);
  public final static native int randombytes_close();
  public final static native void randombytes_stir();
  public final static native void sodium_increment(byte[] jarg1, int jarg2);
  public final static native int crypto_secretbox_keybytes();
  public final static native int crypto_secretbox_noncebytes();
  public final static native int crypto_secretbox_macbytes();
  public final static native int crypto_secretbox_zerobytes();
  public final static native int crypto_secretbox_boxzerobytes();
  public final static native byte[] crypto_secretbox_primitive();
  public final static native int crypto_secretbox_easy(byte[] jarg1, byte[] jarg2, int jarg3, byte[] jarg4, byte[] jarg5);
  public final static native int crypto_secretbox_open_easy(byte[] jarg1, byte[] jarg2, int jarg3, byte[] jarg4, byte[] jarg5);
  public final static native int crypto_secretstream_xchacha20poly1305_init_push(byte[] jarg1, byte[] jarg2, byte[] jarg3);
  public final static native int crypto_secretstream_xchacha20poly1305_push(byte[] jarg1, byte[] jarg2, int[] jarg3, byte[] jarg4, int jarg5, byte[] jarg6, int jarg7, short jarg8);
  public final static native int crypto_secretstream_xchacha20poly1305_init_pull(byte[] jarg1, byte[] jarg2, byte[] jarg3);
  public final static native int crypto_secretstream_xchacha20poly1305_pull(byte[] jarg1, byte[] jarg2, int[] jarg3, byte[] jarg4, byte[] jarg5, int jarg6, byte[] jarg7, int jarg8);
  public final static native int crypto_secretstream_xchacha20poly1305_statebytes();
  public final static native int crypto_secretbox_detached(byte[] jarg1, byte[] jarg2, byte[] jarg3, int jarg4, byte[] jarg5, byte[] jarg6);
  public final static native int crypto_secretbox_open_detached(byte[] jarg1, byte[] jarg2, byte[] jarg3, int jarg4, byte[] jarg5, byte[] jarg6);
  public final static native int crypto_scalarmult_bytes();
  public final static native int crypto_scalarmult_scalarbytes();
  public final static native byte[] crypto_scalarmult_primitive();
  public final static native int crypto_scalarmult_base(byte[] jarg1, byte[] jarg2);
  public final static native int crypto_scalarmult(byte[] jarg1, byte[] jarg2, byte[] jarg3);
  public final static native int crypto_box_seedbytes();
  public final static native int crypto_box_publickeybytes();
  public final static native int crypto_box_secretkeybytes();
  public final static native int crypto_box_noncebytes();
  public final static native int crypto_box_macbytes();
  public final static native byte[] crypto_box_primitive();
  public final static native int crypto_box_keypair(byte[] jarg1, byte[] jarg2);
  public final static native int crypto_box_seed_keypair(byte[] jarg1, byte[] jarg2, byte[] jarg3);
  public final static native int crypto_box_easy(byte[] jarg1, byte[] jarg2, int jarg3, byte[] jarg4, byte[] jarg5, byte[] jarg6);
  public final static native int crypto_box_open_easy(byte[] jarg1, byte[] jarg2, int jarg3, byte[] jarg4, byte[] jarg5, byte[] jarg6);
  public final static native int crypto_box_detached(byte[] jarg1, byte[] jarg2, byte[] jarg3, int jarg4, byte[] jarg5, byte[] jarg6, byte[] jarg7);
  public final static native int crypto_box_open_detached(byte[] jarg1, byte[] jarg2, byte[] jarg3, int jarg4, byte[] jarg5, byte[] jarg6, byte[] jarg7);
  public final static native int crypto_box_beforenmbytes();
  public final static native int crypto_box_beforenm(byte[] jarg1, byte[] jarg2, byte[] jarg3);
  public final static native int crypto_box_easy_afternm(byte[] jarg1, byte[] jarg2, int jarg3, byte[] jarg4, byte[] jarg5);
  public final static native int crypto_box_open_easy_afternm(byte[] jarg1, byte[] jarg2, int jarg3, byte[] jarg4, byte[] jarg5);
  public final static native int crypto_box_detached_afternm(byte[] jarg1, byte[] jarg2, byte[] jarg3, int jarg4, byte[] jarg5, byte[] jarg6);
  public final static native int crypto_box_open_detached_afternm(byte[] jarg1, byte[] jarg2, byte[] jarg3, int jarg4, byte[] jarg5, byte[] jarg6);
  public final static native int crypto_box_sealbytes();
  public final static native int crypto_box_seal(byte[] jarg1, byte[] jarg2, int jarg3, byte[] jarg4);
  public final static native int crypto_box_seal_open(byte[] jarg1, byte[] jarg2, int jarg3, byte[] jarg4, byte[] jarg5);
  public final static native int crypto_box_zerobytes();
  public final static native int crypto_box_boxzerobytes();
  public final static native int crypto_box(byte[] jarg1, byte[] jarg2, int jarg3, byte[] jarg4, byte[] jarg5, byte[] jarg6);
  public final static native int crypto_box_open(byte[] jarg1, byte[] jarg2, int jarg3, byte[] jarg4, byte[] jarg5, byte[] jarg6);
  public final static native int crypto_box_afternm(byte[] jarg1, byte[] jarg2, int jarg3, byte[] jarg4, byte[] jarg5);
  public final static native int crypto_box_open_afternm(byte[] jarg1, byte[] jarg2, int jarg3, byte[] jarg4, byte[] jarg5);
  public final static native int crypto_sign_bytes();
  public final static native int crypto_sign_seedbytes();
  public final static native int crypto_sign_publickeybytes();
  public final static native int crypto_sign_secretkeybytes();
  public final static native byte[] crypto_sign_primitive();
  public final static native int crypto_sign_keypair(byte[] jarg1, byte[] jarg2);
  public final static native int crypto_sign_seed_keypair(byte[] jarg1, byte[] jarg2, byte[] jarg3);
  public final static native int crypto_sign(byte[] jarg1, int[] jarg2, byte[] jarg3, int jarg4, byte[] jarg5);
  public final static native int crypto_sign_open(byte[] jarg1, int[] jarg2, byte[] jarg3, int jarg4, byte[] jarg5);
  public final static native int crypto_sign_detached(byte[] jarg1, int[] jarg2, byte[] jarg3, int jarg4, byte[] jarg5);
  public final static native int crypto_sign_verify_detached(byte[] jarg1, byte[] jarg2, int jarg3, byte[] jarg4);
  public final static native int crypto_sign_ed25519_sk_to_seed(byte[] jarg1, byte[] jarg2);
  public final static native int crypto_sign_ed25519_sk_to_pk(byte[] jarg1, byte[] jarg2);
  public final static native int crypto_generichash_bytes();
  public final static native int crypto_generichash_bytes_min();
  public final static native int crypto_generichash_bytes_max();
  public final static native int crypto_generichash_keybytes();
  public final static native int crypto_generichash_keybytes_min();
  public final static native int crypto_generichash_keybytes_max();
  public final static native byte[] crypto_generichash_primitive();
  public final static native int crypto_generichash(byte[] jarg1, int jarg2, byte[] jarg3, int jarg4, byte[] jarg5, int jarg6);
  public final static native int crypto_generichash_statebytes();
  public final static native int crypto_generichash_init(byte[] jarg1, byte[] jarg2, int jarg3, int jarg4);
  public final static native int crypto_generichash_update(byte[] jarg1, byte[] jarg2, int jarg3);
  public final static native int crypto_generichash_final(byte[] jarg1, byte[] jarg2, int jarg3);
  public final static native int crypto_shorthash_bytes();
  public final static native int crypto_shorthash_keybytes();
  public final static native byte[] crypto_shorthash_primitive();
  public final static native int crypto_shorthash(byte[] jarg1, byte[] jarg2, int jarg3, byte[] jarg4);
  public final static native int crypto_auth_bytes();
  public final static native int crypto_auth_keybytes();
  public final static native byte[] crypto_auth_primitive();
  public final static native int crypto_auth(byte[] jarg1, byte[] jarg2, int jarg3, byte[] jarg4);
  public final static native int crypto_auth_verify(byte[] jarg1, byte[] jarg2, int jarg3, byte[] jarg4);
  public final static native int crypto_onetimeauth_bytes();
  public final static native int crypto_onetimeauth_keybytes();
  public final static native void crypto_onetimeauth_keygen(byte[] jarg1);
  public final static native byte[] crypto_onetimeauth_primitive();
  public final static native int crypto_onetimeauth(byte[] jarg1, byte[] jarg2, int jarg3, byte[] jarg4);
  public final static native int crypto_onetimeauth_verify(byte[] jarg1, byte[] jarg2, int jarg3, byte[] jarg4);
  public final static native int crypto_onetimeauth_statebytes();
  public final static native int crypto_onetimeauth_init(byte[] jarg1, byte[] jarg2);
  public final static native int crypto_onetimeauth_update(byte[] jarg1, byte[] jarg2, int jarg3);
  public final static native int crypto_onetimeauth_final(byte[] jarg1, byte[] jarg2);
  public final static native int crypto_aead_aes256gcm_encrypt(byte[] jarg1, int[] jarg2, byte[] jarg3, int jarg4, byte[] jarg5, int jarg6, byte[] jarg7, byte[] jarg8, byte[] jarg9);
  public final static native int crypto_aead_aes256gcm_decrypt(byte[] jarg1, int[] jarg2, byte[] jarg3, byte[] jarg4, int jarg5, byte[] jarg6, int jarg7, byte[] jarg8, byte[] jarg9);
  public final static native int crypto_aead_aes256gcm_encrypt_detached(byte[] jarg1, byte[] jarg2, int[] jarg3, byte[] jarg4, int jarg5, byte[] jarg6, int jarg7, byte[] jarg8, byte[] jarg9, byte[] jarg10);
  public final static native int crypto_aead_aes256gcm_decrypt_detached(byte[] jarg1, byte[] jarg2, byte[] jarg3, int jarg4, byte[] jarg5, byte[] jarg6, int jarg7, byte[] jarg8, byte[] jarg9);
  public final static native int crypto_aead_chacha20poly1305_encrypt(byte[] jarg1, int[] jarg2, byte[] jarg3, int jarg4, byte[] jarg5, int jarg6, byte[] jarg7, byte[] jarg8, byte[] jarg9);
  public final static native int crypto_aead_chacha20poly1305_decrypt(byte[] jarg1, int[] jarg2, byte[] jarg3, byte[] jarg4, int jarg5, byte[] jarg6, int jarg7, byte[] jarg8, byte[] jarg9);
  public final static native int crypto_aead_chacha20poly1305_encrypt_detached(byte[] jarg1, byte[] jarg2, int[] jarg3, byte[] jarg4, int jarg5, byte[] jarg6, int jarg7, byte[] jarg8, byte[] jarg9, byte[] jarg10);
  public final static native int crypto_aead_chacha20poly1305_decrypt_detached(byte[] jarg1, byte[] jarg2, byte[] jarg3, int jarg4, byte[] jarg5, byte[] jarg6, int jarg7, byte[] jarg8, byte[] jarg9);
  public final static native int crypto_aead_chacha20poly1305_ietf_encrypt(byte[] jarg1, int[] jarg2, byte[] jarg3, int jarg4, byte[] jarg5, int jarg6, byte[] jarg7, byte[] jarg8, byte[] jarg9);
  public final static native int crypto_aead_chacha20poly1305_ietf_decrypt(byte[] jarg1, int[] jarg2, byte[] jarg3, byte[] jarg4, int jarg5, byte[] jarg6, int jarg7, byte[] jarg8, byte[] jarg9);
  public final static native int crypto_aead_chacha20poly1305_ietf_encrypt_detached(byte[] jarg1, byte[] jarg2, int[] jarg3, byte[] jarg4, int jarg5, byte[] jarg6, int jarg7, byte[] jarg8, byte[] jarg9, byte[] jarg10);
  public final static native int crypto_aead_chacha20poly1305_ietf_decrypt_detached(byte[] jarg1, byte[] jarg2, byte[] jarg3, int jarg4, byte[] jarg5, byte[] jarg6, int jarg7, byte[] jarg8, byte[] jarg9);
  public final static native int crypto_aead_xchacha20poly1305_ietf_encrypt(byte[] jarg1, int[] jarg2, byte[] jarg3, int jarg4, byte[] jarg5, int jarg6, byte[] jarg7, byte[] jarg8, byte[] jarg9);
  public final static native int crypto_aead_xchacha20poly1305_ietf_decrypt(byte[] jarg1, int[] jarg2, byte[] jarg3, byte[] jarg4, int jarg5, byte[] jarg6, int jarg7, byte[] jarg8, byte[] jarg9);
  public final static native int crypto_aead_xchacha20poly1305_ietf_encrypt_detached(byte[] jarg1, byte[] jarg2, int[] jarg3, byte[] jarg4, int jarg5, byte[] jarg6, int jarg7, byte[] jarg8, byte[] jarg9, byte[] jarg10);
  public final static native int crypto_aead_xchacha20poly1305_ietf_decrypt_detached(byte[] jarg1, byte[] jarg2, byte[] jarg3, int jarg4, byte[] jarg5, byte[] jarg6, int jarg7, byte[] jarg8, byte[] jarg9);
  public final static native int crypto_kx_seed_keypair(byte[] jarg1, byte[] jarg2, byte[] jarg3);
  public final static native int crypto_kx_keypair(byte[] jarg1, byte[] jarg2);
  public final static native int crypto_kx_client_session_keys(byte[] jarg1, byte[] jarg2, byte[] jarg3, byte[] jarg4, byte[] jarg5);
  public final static native int crypto_kx_server_session_keys(byte[] jarg1, byte[] jarg2, byte[] jarg3, byte[] jarg4, byte[] jarg5);
  public final static native int crypto_auth_hmacsha256_bytes();
  public final static native int crypto_auth_hmacsha256_keybytes();
  public final static native int crypto_auth_hmacsha256(byte[] jarg1, byte[] jarg2, int jarg3, byte[] jarg4);
  public final static native int crypto_auth_hmacsha256_verify(byte[] jarg1, byte[] jarg2, int jarg3, byte[] jarg4);
  public final static native int crypto_auth_hmacsha256_statebytes();
  public final static native int crypto_auth_hmacsha256_init(byte[] jarg1, byte[] jarg2, int jarg3);
  public final static native int crypto_auth_hmacsha256_update(byte[] jarg1, byte[] jarg2, int jarg3);
  public final static native int crypto_auth_hmacsha256_final(byte[] jarg1, byte[] jarg2);
  public final static native int crypto_auth_hmacsha512_bytes();
  public final static native int crypto_auth_hmacsha512_keybytes();
  public final static native int crypto_auth_hmacsha512(byte[] jarg1, byte[] jarg2, int jarg3, byte[] jarg4);
  public final static native int crypto_auth_hmacsha512_verify(byte[] jarg1, byte[] jarg2, int jarg3, byte[] jarg4);
  public final static native int crypto_auth_hmacsha512_statebytes();
  public final static native int crypto_auth_hmacsha512_init(byte[] jarg1, byte[] jarg2, int jarg3);
  public final static native int crypto_auth_hmacsha512_update(byte[] jarg1, byte[] jarg2, int jarg3);
  public final static native int crypto_auth_hmacsha512_final(byte[] jarg1, byte[] jarg2);
  public final static native int crypto_auth_hmacsha512256_bytes();
  public final static native int crypto_auth_hmacsha512256_keybytes();
  public final static native int crypto_auth_hmacsha512256(byte[] jarg1, byte[] jarg2, int jarg3, byte[] jarg4);
  public final static native int crypto_auth_hmacsha512256_verify(byte[] jarg1, byte[] jarg2, int jarg3, byte[] jarg4);
  public final static native int crypto_auth_hmacsha512256_statebytes();
  public final static native int crypto_auth_hmacsha512256_init(byte[] jarg1, byte[] jarg2, int jarg3);
  public final static native int crypto_auth_hmacsha512256_update(byte[] jarg1, byte[] jarg2, int jarg3);
  public final static native int crypto_auth_hmacsha512256_final(byte[] jarg1, byte[] jarg2);
  public final static native int crypto_box_curve25519xsalsa20poly1305_seedbytes();
  public final static native int crypto_box_curve25519xsalsa20poly1305_publickeybytes();
  public final static native int crypto_box_curve25519xsalsa20poly1305_secretkeybytes();
  public final static native int crypto_box_curve25519xsalsa20poly1305_beforenmbytes();
  public final static native int crypto_box_curve25519xsalsa20poly1305_noncebytes();
  public final static native int crypto_box_curve25519xsalsa20poly1305_zerobytes();
  public final static native int crypto_box_curve25519xsalsa20poly1305_boxzerobytes();
  public final static native int crypto_box_curve25519xsalsa20poly1305_macbytes();
  public final static native int crypto_box_curve25519xsalsa20poly1305(byte[] jarg1, byte[] jarg2, int jarg3, byte[] jarg4, byte[] jarg5, byte[] jarg6);
  public final static native int crypto_box_curve25519xsalsa20poly1305_open(byte[] jarg1, byte[] jarg2, int jarg3, byte[] jarg4, byte[] jarg5, byte[] jarg6);
  public final static native int crypto_box_curve25519xsalsa20poly1305_seed_keypair(byte[] jarg1, byte[] jarg2, byte[] jarg3);
  public final static native int crypto_box_curve25519xsalsa20poly1305_keypair(byte[] jarg1, byte[] jarg2);
  public final static native int crypto_box_curve25519xsalsa20poly1305_beforenm(byte[] jarg1, byte[] jarg2, byte[] jarg3);
  public final static native int crypto_box_curve25519xsalsa20poly1305_afternm(byte[] jarg1, byte[] jarg2, int jarg3, byte[] jarg4, byte[] jarg5);
  public final static native int crypto_box_curve25519xsalsa20poly1305_open_afternm(byte[] jarg1, byte[] jarg2, int jarg3, byte[] jarg4, byte[] jarg5);
  public final static native int crypto_core_hsalsa20_outputbytes();
  public final static native int crypto_core_hsalsa20_inputbytes();
  public final static native int crypto_core_hsalsa20_keybytes();
  public final static native int crypto_core_hsalsa20_constbytes();
  public final static native int crypto_core_hsalsa20(byte[] jarg1, byte[] jarg2, byte[] jarg3, byte[] jarg4);
  public final static native int crypto_core_salsa20_outputbytes();
  public final static native int crypto_core_salsa20_inputbytes();
  public final static native int crypto_core_salsa20_keybytes();
  public final static native int crypto_core_salsa20_constbytes();
  public final static native int crypto_core_salsa20(byte[] jarg1, byte[] jarg2, byte[] jarg3, byte[] jarg4);
  public final static native int crypto_generichash_blake2b_bytes_min();
  public final static native int crypto_generichash_blake2b_bytes_max();
  public final static native int crypto_generichash_blake2b_bytes();
  public final static native int crypto_generichash_blake2b_keybytes_min();
  public final static native int crypto_generichash_blake2b_keybytes_max();
  public final static native int crypto_generichash_blake2b_keybytes();
  public final static native int crypto_generichash_blake2b_saltbytes();
  public final static native int crypto_generichash_blake2b_personalbytes();
  public final static native int crypto_generichash_blake2b(byte[] jarg1, int jarg2, byte[] jarg3, int jarg4, byte[] jarg5, int jarg6);
  public final static native int crypto_generichash_blake2b_salt_personal(byte[] jarg1, int jarg2, byte[] jarg3, int jarg4, byte[] jarg5, int jarg6, byte[] jarg7, byte[] jarg8);
  public final static native int crypto_generichash_blake2b_init(byte[] jarg1, byte[] jarg2, int jarg3, int jarg4);
  public final static native int crypto_generichash_blake2b_init_salt_personal(byte[] jarg1, byte[] jarg2, int jarg3, int jarg4, byte[] jarg5, byte[] jarg6);
  public final static native int crypto_generichash_blake2b_update(byte[] jarg1, byte[] jarg2, int jarg3);
  public final static native int crypto_generichash_blake2b_final(byte[] jarg1, byte[] jarg2, int jarg3);
  public final static native int crypto_hash_sha256_bytes();
  public final static native int crypto_hash_sha256(byte[] jarg1, byte[] jarg2, int jarg3);
  public final static native int crypto_hash_sha256_statebytes();
  public final static native int crypto_hash_sha256_init(byte[] jarg1);
  public final static native int crypto_hash_sha256_update(byte[] jarg1, byte[] jarg2, int jarg3);
  public final static native int crypto_hash_sha256_final(byte[] jarg1, byte[] jarg2);
  public final static native int crypto_hash_sha512_bytes();
  public final static native int crypto_hash_sha512(byte[] jarg1, byte[] jarg2, int jarg3);
  public final static native int crypto_hash_sha512_statebytes();
  public final static native int crypto_hash_sha512_init(byte[] jarg1);
  public final static native int crypto_hash_sha512_update(byte[] jarg1, byte[] jarg2, int jarg3);
  public final static native int crypto_hash_sha512_final(byte[] jarg1, byte[] jarg2);
  public final static native int crypto_onetimeauth_poly1305_bytes();
  public final static native int crypto_onetimeauth_poly1305_keybytes();
  public final static native int crypto_onetimeauth_poly1305(byte[] jarg1, byte[] jarg2, int jarg3, byte[] jarg4);
  public final static native int crypto_onetimeauth_poly1305_verify(byte[] jarg1, byte[] jarg2, int jarg3, byte[] jarg4);
  public final static native int crypto_onetimeauth_poly1305_init(byte[] jarg1, byte[] jarg2);
  public final static native int crypto_onetimeauth_poly1305_update(byte[] jarg1, byte[] jarg2, int jarg3);
  public final static native int crypto_onetimeauth_poly1305_final(byte[] jarg1, byte[] jarg2);
  public final static native int crypto_pwhash_alg_argon2i13();
  public final static native int crypto_pwhash_alg_default();
  public final static native int crypto_pwhash_bytes_min();
  public final static native int crypto_pwhash_bytes_max();
  public final static native int crypto_pwhash_passwd_min();
  public final static native int crypto_pwhash_passwd_max();
  public final static native int crypto_pwhash_saltbytes();
  public final static native int crypto_pwhash_strbytes();
  public final static native byte[] crypto_pwhash_strprefix();
  public final static native int crypto_pwhash_opslimit_min();
  public final static native int crypto_pwhash_opslimit_max();
  public final static native int crypto_pwhash_memlimit_min();
  public final static native int crypto_pwhash_memlimit_max();
  public final static native int crypto_pwhash_opslimit_interactive();
  public final static native int crypto_pwhash_memlimit_interactive();
  public final static native int crypto_pwhash_opslimit_moderate();
  public final static native int crypto_pwhash_memlimit_moderate();
  public final static native int crypto_pwhash_opslimit_sensitive();
  public final static native int crypto_pwhash_memlimit_sensitive();
  public final static native int crypto_pwhash(byte[] jarg1, int jarg2, byte[] jarg3, int jarg4, byte[] jarg5, int jarg6, int jarg7, int jarg8);
  public final static native int crypto_pwhash_str(byte[] jarg1, byte[] jarg2, int jarg3, int jarg4, int jarg5);
  public final static native int crypto_pwhash_str_verify(byte[] jarg1, byte[] jarg2, int jarg3);
  public final static native byte[] crypto_pwhash_primitive();
  public final static native int crypto_pwhash_scryptsalsa208sha256_saltbytes();
  public final static native int crypto_pwhash_scryptsalsa208sha256_strbytes();
  public final static native byte[] crypto_pwhash_scryptsalsa208sha256_strprefix();
  public final static native int crypto_pwhash_scryptsalsa208sha256_opslimit_interactive();
  public final static native int crypto_pwhash_scryptsalsa208sha256_memlimit_interactive();
  public final static native int crypto_pwhash_scryptsalsa208sha256_opslimit_sensitive();
  public final static native int crypto_pwhash_scryptsalsa208sha256_memlimit_sensitive();
  public final static native int crypto_pwhash_scryptsalsa208sha256(byte[] jarg1, int jarg2, byte[] jarg3, int jarg4, byte[] jarg5, int jarg6, int jarg7);
  public final static native int crypto_pwhash_scryptsalsa208sha256_str(byte[] jarg1, byte[] jarg2, int jarg3, int jarg4, int jarg5);
  public final static native int crypto_pwhash_scryptsalsa208sha256_str_verify(byte[] jarg1, byte[] jarg2, int jarg3);
  public final static native int crypto_pwhash_scryptsalsa208sha256_ll(byte[] jarg1, int jarg2, byte[] jarg3, int jarg4, int jarg5, int jarg6, int jarg7, byte[] jarg8, int jarg9);
  public final static native int crypto_pwhash_scryptsalsa208sha256_str_needs_rehash(byte[] jarg1, int jarg2, int jarg3);
  public final static native int crypto_scalarmult_curve25519_bytes();
  public final static native int crypto_scalarmult_curve25519_scalarbytes();
  public final static native int crypto_scalarmult_curve25519(byte[] jarg1, byte[] jarg2, byte[] jarg3);
  public final static native int crypto_scalarmult_curve25519_base(byte[] jarg1, byte[] jarg2);
  public final static native int crypto_secretbox_xsalsa20poly1305_keybytes();
  public final static native int crypto_secretbox_xsalsa20poly1305_noncebytes();
  public final static native int crypto_secretbox_xsalsa20poly1305_zerobytes();
  public final static native int crypto_secretbox_xsalsa20poly1305_boxzerobytes();
  public final static native int crypto_secretbox_xsalsa20poly1305_macbytes();
  public final static native int crypto_secretbox_xsalsa20poly1305(byte[] jarg1, byte[] jarg2, int jarg3, byte[] jarg4, byte[] jarg5);
  public final static native int crypto_secretbox_xsalsa20poly1305_open(byte[] jarg1, byte[] jarg2, int jarg3, byte[] jarg4, byte[] jarg5);
  public final static native int crypto_secretbox_xchacha20poly1305_easy(byte[] jarg1, byte[] jarg2, int jarg3, byte[] jarg4, byte[] jarg5);
  public final static native int crypto_secretbox_xchacha20poly1305_open_easy(byte[] jarg1, byte[] jarg2, int jarg3, byte[] jarg4, byte[] jarg5);
  public final static native int crypto_secretbox_xchacha20poly1305_detached(byte[] jarg1, byte[] jarg2, byte[] jarg3, int jarg4, byte[] jarg5, byte[] jarg6);
  public final static native int crypto_secretbox_xchacha20poly1305_open_detached(byte[] jarg1, byte[] jarg2, byte[] jarg3, int jarg4, byte[] jarg5, byte[] jarg6);
  public final static native int crypto_shorthash_siphash24_bytes();
  public final static native int crypto_shorthash_siphash24_keybytes();
  public final static native int crypto_shorthash_siphash24(byte[] jarg1, byte[] jarg2, int jarg3, byte[] jarg4);
  public final static native int crypto_sign_ed25519_bytes();
  public final static native int crypto_sign_ed25519_seedbytes();
  public final static native int crypto_sign_ed25519_publickeybytes();
  public final static native int crypto_sign_ed25519_secretkeybytes();
  public final static native int crypto_sign_ed25519(byte[] jarg1, int[] jarg2, byte[] jarg3, int jarg4, byte[] jarg5);
  public final static native int crypto_sign_ed25519_open(byte[] jarg1, int[] jarg2, byte[] jarg3, int jarg4, byte[] jarg5);
  public final static native int crypto_stream_xsalsa20(byte[] jarg1, int jarg2, byte[] jarg3, byte[] jarg4);
  public final static native int crypto_sign_ed25519_detached(byte[] jarg1, int[] jarg2, byte[] jarg3, int jarg4, byte[] jarg5);
  public final static native int crypto_sign_ed25519_verify_detached(byte[] jarg1, byte[] jarg2, int jarg3, byte[] jarg4);
  public final static native int crypto_sign_ed25519_keypair(byte[] jarg1, byte[] jarg2);
  public final static native int crypto_sign_ed25519_seed_keypair(byte[] jarg1, byte[] jarg2, byte[] jarg3);
  public final static native int crypto_sign_ed25519_pk_to_curve25519(byte[] jarg1, byte[] jarg2);
  public final static native int crypto_sign_ed25519_sk_to_curve25519(byte[] jarg1, byte[] jarg2);
  public final static native int crypto_stream_chacha20_keybytes();
  public final static native int crypto_stream_chacha20_noncebytes();
  public final static native int crypto_stream_chacha20(byte[] jarg1, int jarg2, byte[] jarg3, byte[] jarg4);
  public final static native int crypto_stream_chacha20_xor(byte[] jarg1, byte[] jarg2, int jarg3, byte[] jarg4, byte[] jarg5);
  public final static native int crypto_stream_chacha20_xor_ic(byte[] jarg1, byte[] jarg2, int jarg3, byte[] jarg4, int jarg5, byte[] jarg6);
  public final static native int crypto_stream_chacha20_ietf_noncebytes();
  public final static native int crypto_stream_chacha20_ietf(byte[] jarg1, int jarg2, byte[] jarg3, byte[] jarg4);
  public final static native int crypto_stream_chacha20_ietf_xor(byte[] jarg1, byte[] jarg2, int jarg3, byte[] jarg4, byte[] jarg5);
  public final static native int crypto_stream_chacha20_ietf_xor_ic(byte[] jarg1, byte[] jarg2, int jarg3, byte[] jarg4, int jarg5, byte[] jarg6);
  public final static native int crypto_stream_salsa20_keybytes();
  public final static native int crypto_stream_salsa20_noncebytes();
  public final static native int crypto_stream_salsa20(byte[] jarg1, int jarg2, byte[] jarg3, byte[] jarg4);
  public final static native int crypto_stream_salsa20_xor(byte[] jarg1, byte[] jarg2, int jarg3, byte[] jarg4, byte[] jarg5);
  public final static native int crypto_stream_salsa20_xor_ic(byte[] jarg1, byte[] jarg2, int jarg3, byte[] jarg4, int jarg5, byte[] jarg6);
  public final static native int crypto_stream_xsalsa20_keybytes();
  public final static native int crypto_stream_xsalsa20_noncebytes();
  public final static native int crypto_stream_xsalsa20_xor(byte[] jarg1, byte[] jarg2, int jarg3, byte[] jarg4, byte[] jarg5);
  public final static native int crypto_stream_xsalsa20_xor_ic(byte[] jarg1, byte[] jarg2, int jarg3, byte[] jarg4, int jarg5, byte[] jarg6);
  public final static native void crypto_kdf_keygen(byte[] jarg1);
  public final static native int crypto_kdf_derive_from_key(byte[] jarg1, int jarg2, int jarg3, byte[] jarg4, byte[] jarg5);
}
