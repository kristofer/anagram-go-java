//: Playground - noun: a place where people can play

let string1 = "aab"
let string2 = "aba"
let string3 = "cab"
let string4 = "kjfdhskdhfksdhk"
let string5 = "Kjfdhskdhfksdhk"

func anagram(_ x: String, _ y: String) -> Bool {
    if x == y {
        return true
    }

    if x.count != y.count {
        return false
    }

    var dictx = [String: Int]()
    var dicty = [String: Int]()

    for i in x {
        let ii = "\(i)"
        if dictx[ii] != nil {
            let n = dictx[ii]! + 1
            dictx[ii] = n
        } else {
            dictx[ii] = 1
        }
    }

    for i in y {
        let ii = "\(i)"
        if dicty[ii] != nil {
            let n = dicty[ii]! + 1
            dicty[ii] = n
        } else {
            dicty[ii] = 1
        }
    }
    if dictx.count != dicty.count {
        return false
    }
    for (k, v) in dictx {
        if let vy = dicty[k] {
            if v != vy {
                return false
            }
        }
    }

    return true
}

func main() {
    print(anagram(string1, string1))
    print(anagram(string1, string2))
    print(anagram(string1, string3))
    print(anagram(string1, string4))
    print(anagram(string4, string5))
}

main()
