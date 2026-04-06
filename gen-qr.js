// Function to generate barcode data
async function generateBarcodeData(staticBarcodePayload, keyVersion, epochSecond) {
	// Ensure inputs are not null or undefined
	if (!staticBarcodePayload || isNaN(keyVersion)) {
		throw new Error("All parameters must be provided and valid");
	}

	// Retrieve the private key from the constant object
	const privateKey = privateKeys[keyVersion];
	if (!privateKey) {
		throw new Error("Invalid keyVersion provided");
	}

	// Decode the static barcode payload
	const decodeArray = Uint8Array.from(atob(staticBarcodePayload), (c) => c.charCodeAt(0));

	// Create a plaintext buffer in big-endian form
    const plaintextBuffer = new ArrayBuffer(0x2a);
	const plaintextBytes = new Uint8Array(plaintextBuffer);
	const dataView = new DataView(plaintextBuffer);

	// Copy decoded array to the buffer
	plaintextBytes.set(decodeArray, 0);

	// Write key version to buffer in big-endian form
	dataView.setUint16(0x24, keyVersion, false);

	// Write epoch second to buffer in big-endian form
	dataView.setInt32(0x26, Math.floor(epochSecond), false);

	// Generate private key from the provided private key string
	const encodedPrivateKey = Uint8Array.from(atob(privateKey), (c) => c.charCodeAt(0));
	const ecKeyPair = await window.crypto.subtle.importKey(
		"pkcs8",
		encodedPrivateKey,
		{ name: "ECDSA", namedCurve: "P-256" },
		false,
		["sign"],
	);

	// Sign the plaintext buffer
	const signatureArrayBuffer = await window.crypto.subtle.sign(
		{ name: "ECDSA", hash: { name: "SHA-256" } },
		ecKeyPair,
		plaintextBytes,
	);

	// Truncate the signature array to 72 bytes
	const signArrayTruncated = new Uint8Array(signatureArrayBuffer.slice(0, 0x48));

	// Combine plaintext and truncated signature arrays
	const combinedArray = new Uint8Array(0x72);
	combinedArray.set(plaintextBytes, 0x00);
	combinedArray.set(signArrayTruncated, 0x2a);

	return combinedArray;
}

/*
To reproduce, do:
curl https://mapi.production.mvticketing.com/fare-medias/private-keys -L -H "appid: octa" | jq 'map({"key":(.version|tostring),"value":.key}) | from_entries' >private-keys.json
*/
const privateKeys = {
	100: "MEECAQAwEwYHKoZIzj0CAQYIKoZIzj0DAQcEJzAlAgEBBCCui7uyfzDskEdd0up+Dr1UblNNlqfwZVeCZilYP3TW+Q==",
	101: "MEECAQAwEwYHKoZIzj0CAQYIKoZIzj0DAQcEJzAlAgEBBCA+e8FN3EzIDCbmr1KjH2Oj4Uav0WT/TQiiBk8uG3nZUg==",
	102: "MEECAQAwEwYHKoZIzj0CAQYIKoZIzj0DAQcEJzAlAgEBBCDfZxQSvq+GgBWzGbbfP8p+JnrN9Z8Z3ApVvJbL9gYwIw==",
	103: "MEECAQAwEwYHKoZIzj0CAQYIKoZIzj0DAQcEJzAlAgEBBCBkrg/YAzHoWDtoCYQTE1F6Fb59GVPJOmBp+Pq3Em+OJQ==",
	104: "MEECAQAwEwYHKoZIzj0CAQYIKoZIzj0DAQcEJzAlAgEBBCA/AxDzaxhh6nmspxZ3ZS6FXSBxVWCbXUmSm0uyvObR3Q==",
	105: "MEECAQAwEwYHKoZIzj0CAQYIKoZIzj0DAQcEJzAlAgEBBCDhWAlVMKvPE3OWkAd3Wklq9g1X7lBa3kndS5Rqb5dQTQ==",
	106: "MEECAQAwEwYHKoZIzj0CAQYIKoZIzj0DAQcEJzAlAgEBBCDKnwizjmIc2BhQ8AKi3cyyRhVnxl7mb96FFyNyzMf/8Q==",
	107: "MEECAQAwEwYHKoZIzj0CAQYIKoZIzj0DAQcEJzAlAgEBBCBoItY+Du1Rj9BkUBWvBZjWnTDMKgAsi+pWntBQ1SD+NQ==",
	108: "MEECAQAwEwYHKoZIzj0CAQYIKoZIzj0DAQcEJzAlAgEBBCCc7wUjQCRfuaqBawzuTxpm4AzaJp17iu1Jwj+twQpphQ==",
	109: "MEECAQAwEwYHKoZIzj0CAQYIKoZIzj0DAQcEJzAlAgEBBCDBJNSBGsWrYFgKJIiv8H9WVb1eYRnu4SSWPpYF3w9VZQ==",
};

// Example usage
const staticBarcodePayload = "abwAAwACEAAAAAAAIjCQcmmmj7xriRS8AAC+JkE/SOS7qGCy";
const keyVersion = 100; // Change this to the appropriate version
const epochSecond = Date.now() / 1000;

await generateBarcodeData(staticBarcodePayload, keyVersion, epochSecond);
