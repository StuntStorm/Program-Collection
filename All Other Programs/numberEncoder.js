const encoder = (textToEncode, encoderKey) => {
    let index = 1;

    return [...textToEncode].reduce((alreadyEncode, charToEncode) => {
        alreadyEncode += String.fromCharCode(charToEncode.charCodeAt() + parseInt(String(encoderKey)[index-1]));
        index % String(encoderKey).length == 0 ? index = 1 : index++;        
        return alreadyEncode;
    },"")

}
