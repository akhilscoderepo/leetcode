// Last updated: 26/12/2025, 16:00:00
/**
 * @param {string} text
 * @return {number}
 */
var maxNumberOfBalloons = function(text) {
    const map={b:0,a:0,l:0,o:0,n:0}
    for(let c of text){
        map[c]++
    }
    return Math.floor(Math.min(map.b,map.a,map.l/2,map.o/2,map.n))
};