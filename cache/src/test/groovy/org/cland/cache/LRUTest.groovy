package org.cland.cache

import spock.lang.Ignore
import spock.lang.Specification

class LRUTest extends Specification {
    def "test get"() {
        given:
        def max=10
        def lru=new LRU(max)
        when:
        for(x in (1..100)){
            lru.put(x,"${x}x")
        }
        then:
        lru.get(91) == 91+'x'
        lru.get(100)==100+'x'
    }

    @Ignore
    def "test remove"() {
        given:
        def max=10
        def lru=new LRU(max)
        when:
        for(x in (1..100)){
            lru.put(1,'${x}v')
        }
        then:
        lru.get(91) == 91+'x'
        lru.get(100)==100+'x'
    }
    @Ignore
    def "test put"() {
        given:
        def max=10
        def lru=new LRU(max)
        when:
        for(x in (1..100)){
            lru.put(1,'${x}v')
        }
        then:
        lru.get(91) == 91+'x'
        lru.get(100)==100+'x'
    }



    @Ignore
    def "test size"() {
        given:
        def max=10
        def lru=new LRU(max)
        when:
        for(x in (1..100)){
            lru.put(1,'${x}v')
        }
        then:
        lru.get(91) == 91+'x'
        lru.get(100)==100+'x'
    }

    @Ignore
    def "length of Spock's and his friends' names"() {
        expect:
        name.size() == length

        where:
        name     | length
        "Spock"  | 5
        "Kirk"   | 4
        "Scotty" | 6
    }

    @Ignore
    def "测试LUR算法"(){
        given:
        def max=10
        def lru=new LRU(max)
        when:
        for(x in (1..100)){
            lru.put(1,'${x}v')
        }
        then:
        lru.get(91) == 91+'x'
        lru.get(100)==100+'x'

    }
}
