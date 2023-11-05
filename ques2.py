class Solution:
    def areIsomorphic(self, s1 : str, s2 : str) -> bool:
        # code here
        m=len(s1)
        n=len(s2)
        if m!=n:
            return False
        v=[False]*256
        map=[-1]*256
        for i in range(n):
            if map[ord(s1[i])]==-1:
                if v[ord(s2[i])]==True:
                    return False
                v[ord(s2[i])]=True
                map[ord(s1[i])]=s2[i]
            elif map[ord(s1[i])]!=s2[i]:
                return False
        return True
        

