// Last updated: 26/12/2025, 16:00:58
/**
 * @param {string} ransomNote
 * @param {string} magazine
 * @return {boolean}
 */
var canConstruct = function(ransomNote, magazine) {
    let r = new Array(26).fill(0)
    let m = new Array(26).fill(0)

    for(let i = 0; i < ransomNote.length; i++){
        ++r[ransomNote.charCodeAt(i)-97]
    }


    for(let i = 0; i < magazine.length; i++){
        ++m[magazine.charCodeAt(i)-97]
    }

    for(let j = 0; j< 26 ; j++){
        if(r[j] > m[j]){
            return false
        }
    }

    return true
};