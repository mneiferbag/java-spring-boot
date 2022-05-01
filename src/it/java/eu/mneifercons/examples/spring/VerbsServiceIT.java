package eu.mneifercons.examples.spring;

import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class VerbsServiceIT {

    @Test
    public void getVerb() {
        given()
            .baseUri( forTestServer( "http://localhost:8080/v1"))
        .when()
            .request( "GET", "/verb")
        .then()
            .statusCode( isSuccess())
            ;
    }
/*
    @Test
    public void postVerb_BodyDefined_Is_Yes() {
        given()
            .baseUri( forTestServer( "http://localhost:8080/v1"))
            .contentType( "application/json")
            .request().body( "{}")
        .when()
            .request( "POST", "/verb")
        .then()
            .statusCode( isSuccess())
            ;
    }

    @Test
    public void postVerb_BodyApplicationJsonValuePropertyCount_Is_Gt_0() {
        given()
            .baseUri( forTestServer( "http://localhost:8080/v1"))
            .contentType( "application/json")
            .request().body( "{\"thirds\":\"c&9mQ&fU]&Mt~_E5UlgF&m'+}IGcEhmS E 6?(9y:)TYhiD[>)(cn?b+.`jK9+?$B^p4Y&7*ErN&=!_l0*`-a4aGSpu5OMM,UDWILk1/RQ4c{fOLgj^4S4VoLC$T@b=[h@xW}\\\"Hbar`zL@r<B(eD1k?F\\\\0=)m?`4I;[\\\\WT\",\"seconds\":\"2(D5CJ|$U63$jp*|&5Wj\\\\=[p|w>\",\"third\":\"tco,G)B:{=\\\\\\\"J0Z9t!1`aKS=g7oIUhc3&na{(Jd:|=i$qtgoHG6(eI&{FaE^]#8zsw#t.X-7g!h1@ThJ.9I>;PUtr<Chj)@ \\\"cT(%qN\",\"name\":\"x$Fq)/g!.cJ5+i_1>/ )tD\\\"&Uf/aS7q)c?*e?-uCp\",\"firsts\":\"l'W4umR`.v$c>:Nbm/Vwijf6o#fwF]Oungn6f[b_$|X[SQrCl>e*t;`]%h!5+dE[B1x9^_zI#9 ?9,?^R!t*91aiY#kn#q`/6I8*GB:vAsf@z-gb_V$4iIUf~3TyYQt}A\\\"JMIw){+7%{~zOas_^&#$R,,QuuTjg'Ze*(Inx]B\\\"jd0W!q%0/\\\"oG|7;?xVpC1h;txn*K(`)Sj)';g)eHuTcz`\",\"first\":\"C\\\\e00M5[bqG` gUmLEj[Ec=0HH7}5w.#hO2TEHAZh7(gQ$?M0Jc ;[=wz7,*Ij504fo'L!Ze$>Ix)}DBf%4q(p4CSehDn|~9<@~#TG0?~u/\\\\]O4#'g%LL|$*;7uZbZoQw3/HR#h&8]59o|Qpp\",\"second\":\"M_.Ie%1]!In6hx]h9N[ <n@nGjmRuaHM=OB!cj@F8Ll3,MudZBJEg~BD/n/2Jn;_EMHx%7&qAj:yCe^fIi-4xi4eI-MQP+/AAf73\\\\y~j|Y3A.q_H*d.#_l]BhSp}6nbX'r,w:S$sDs\\\"SZ ]oB.aLhz|T'|iiAyY\\\"BT-FC~^`H1M#6a4nSX1<:@R(u8mI[6c3  &Hz}FIc{b82}pM={GF\\\"E[O9\",\"gwumkb\":true}")
        .when()
            .request( "POST", "/verb")
        .then()
            .statusCode( isSuccess())
            ;
    }

    @Test
    public void postVerb_BodyApplicationJsonValuePropertiesNameValueLength_Is_0() {
        given()
            .baseUri( forTestServer( "http://localhost:8080/v1"))
            .contentType( "application/json")
            .request().body( "{\"name\":\"\"}")
        .when()
            .request( "POST", "/verb")
        .then()
            .statusCode( isSuccess())
            ;
    }

    @Test
    public void postVerb_BodyApplicationJsonValuePropertiesFirstValueLength_Is_0() {
        given()
            .baseUri( forTestServer( "http://localhost:8080/v1"))
            .contentType( "application/json")
            .request().body( "{\"thirds\":\"\",\"seconds\":\"\",\"third\":\"\",\"firsts\":\"\",\"first\":\"\",\"second\":\"\",\"mijo\":[\":z[>Q\",\"579~Il[*\"],\"ljcqstm\":571,\"yrujgebgl\":[]}")
        .when()
            .request( "POST", "/verb")
        .then()
            .statusCode( isSuccess())
            ;
    }

    @Test
    public void postVerb_BodyDefined_Is_No() {
        given()
            .baseUri( forTestServer( "http://localhost:8080/v1"))
        .when()
            .request( "POST", "/verb")
        .then()
            // Body.Defined=No
            .statusCode( isBadRequest())
            ;
    }

    @Test
    public void postVerb_BodyMediaType_Is_Other() {
        given()
            .baseUri( forTestServer( "http://localhost:8080/v1"))
            .contentType( "application/x-www-form-urlencoded")
            .formParam( "integer", "274")
        .when()
            .request( "POST", "/verb")
        .then()
            // Body.Media-Type=Other
            .statusCode( isBadRequest())
            ;
    }

    @Test
    public void postVerb_BodyApplicationJsonType_Is_Null() {
        given()
            .baseUri( forTestServer( "http://localhost:8080/v1"))
            .contentType( "application/json")
            .request().body( "null")
        .when()
            .request( "POST", "/verb")
        .then()
            // Body.application-json.Type=null
            .statusCode( isBadRequest())
            ;
    }

    @Test
    public void postVerb_BodyApplicationJsonType_Is_NotObject() {
        given()
            .baseUri( forTestServer( "http://localhost:8080/v1"))
            .contentType( "application/json")
            .request().body( "\"- pC\"")
        .when()
            .request( "POST", "/verb")
        .then()
            // Body.application-json.Type=Not object
            .statusCode( isBadRequest())
            ;
    }

    @Test
    public void postVerb_BodyApplicationJsonValuePropertiesNameType_Is_Null() {
        given()
            .baseUri( forTestServer( "http://localhost:8080/v1"))
            .contentType( "application/json")
            .request().body( "{\"name\":null}")
        .when()
            .request( "POST", "/verb")
        .then()
            // Body.application-json.Value.Properties.name.Type=null
            .statusCode( isBadRequest())
            ;
    }

    @Test
    public void postVerb_BodyApplicationJsonValuePropertiesNameType_Is_NotString() {
        given()
            .baseUri( forTestServer( "http://localhost:8080/v1"))
            .contentType( "application/json")
            .request().body( "{\"name\":[\"\"]}")
        .when()
            .request( "POST", "/verb")
        .then()
            // Body.application-json.Value.Properties.name.Type=Not string
            .statusCode( isBadRequest())
            ;
    }

    @Test
    public void postVerb_BodyApplicationJsonValuePropertiesFirstType_Is_Null() {
        given()
            .baseUri( forTestServer( "http://localhost:8080/v1"))
            .contentType( "application/json")
            .request().body( "{\"name\":\"C*~u;yQ'-ZJtH^`O$QKtv@W+?0H6McZvg?LbI0!T#=}Hp.]Cax-A2A1;!~ZSSWR8+S?pBup_na`Xgwl'%n*fWh/PSqb9AemI)CIU%vaw0)zc/_8x`j.hQ/3?x3 eA)x)fp2Zytjkp1JQU|<}#=KQ(yZ&W]qGu9T~@&3fKXViaEDe']}bBfM\\\\ij2\\\"zm@=}0?`:6yu@G*bEnv;UK^319VJ:cS'Y(*_}\\\"a'$R]\\\\[fgLClnE/<*:fS&HF\",\"first\":null}")
        .when()
            .request( "POST", "/verb")
        .then()
            // Body.application-json.Value.Properties.first.Type=null
            .statusCode( isBadRequest())
            ;
    }

    @Test
    public void postVerb_BodyApplicationJsonValuePropertiesFirstType_Is_NotString() {
        given()
            .baseUri( forTestServer( "http://localhost:8080/v1"))
            .contentType( "application/json")
            .request().body( "{\"name\":\"D0=b%_J?g/7Bp2<GC&<KCNbws/H;zmplF+Pvl.F7:HUAob 73+x/8 ?`20Uh$>~`oAm[9Eti~Z0gY-.Xqb[?hk?0qqXxi0u^'twu1.2MW0qb}L1d0G![|X%nu.WY@/$PVJK$4@%~8}=`<C,i>.CZK!v9B\\\"t=b/:1[\\\\-YD1W&|qV1z@IiBs7$hWYeF&Q,k@`e72<e.4P7*)S-Z8(}R&i==SG7{kB5V1V:-RBj\\\\HX>4\",\"first\":[\"W\",\"{qa\"]}")
        .when()
            .request( "POST", "/verb")
        .then()
            // Body.application-json.Value.Properties.first.Type=Not string
            .statusCode( isBadRequest())
            ;
    }

    @Test
    public void postVerb_BodyApplicationJsonValuePropertiesSecondType_Is_Null() {
        given()
            .baseUri( forTestServer( "http://localhost:8080/v1"))
            .contentType( "application/json")
            .request().body( "{\"name\":\"}e@@iqVW$H@,8Ky/T*M;gFS*X>FD@>P1: ($`\\\\^E%?om%#sT*kp.BL';nzq'x{!:V5$RY]'H)Rb,>i?c);6H~xLsWv0jv8U;JI_M6i-7q]Vu4gx<,A9vRA(CS2^K7|MSXYc0]Wwi-}i7lZcXh#C6bD92^4BpX3{UNr?&2mv+3?MS XYU=<G;\\\"qN9~[?wx~]ouay>'-&~K<4EQ>}@a4%`unuN~{(&\",\"second\":null}")
        .when()
            .request( "POST", "/verb")
        .then()
            // Body.application-json.Value.Properties.second.Type=null
            .statusCode( isBadRequest())
            ;
    }

    @Test
    public void postVerb_BodyApplicationJsonValuePropertiesSecondType_Is_NotString() {
        given()
            .baseUri( forTestServer( "http://localhost:8080/v1"))
            .contentType( "application/json")
            .request().body( "{\"name\":\"FM-R{CxVJ0zMgM_{4_Nr-HP\\\\2`BLq-<Z-?:3~=n`DZEVt.'e%}Lx8>e0rlLyk,I;ic []c\\\\_JE93L1K-r7Su7P~bjT$eM+*@7>HH7HK1BcX*5,a@w'593wDLEUQ[b.i+Dxqe[/6xw[Wg\",\"second\":-105.5}")
        .when()
            .request( "POST", "/verb")
        .then()
            // Body.application-json.Value.Properties.second.Type=Not string
            .statusCode( isBadRequest())
            ;
    }

    @Test
    public void postVerb_BodyApplicationJsonValuePropertiesThirdType_Is_Null() {
        given()
            .baseUri( forTestServer( "http://localhost:8080/v1"))
            .contentType( "application/json")
            .request().body( "{\"third\":null,\"name\":\"BUI2hc6 xN|z\\\"0`G<bo+yE*w3Ben6NMac ;LPFta=;hNt)W8t$h-^S@d:b@:i]W9|AM%FglkG0z]3MnvTz[2CDEg-u;dfl?T`d4N`Q>uastIl~i1M\"}")
        .when()
            .request( "POST", "/verb")
        .then()
            // Body.application-json.Value.Properties.third.Type=null
            .statusCode( isBadRequest())
            ;
    }

    @Test
    public void postVerb_BodyApplicationJsonValuePropertiesThirdType_Is_NotString() {
        given()
            .baseUri( forTestServer( "http://localhost:8080/v1"))
            .contentType( "application/json")
            .request().body( "{\"third\":739.7,\"name\":\"MVq0xpv=kX6d%uimMxSQ)c)Ao`yUtQX\\\\kKv )upXoA<l)G8^q/M%mnw\\\\f3r_U$F4i:bisVyCA^7hcprw/u3)vG{wpsZb4ty7((da9_lX/}1n+2DjVKk'p|GIOg&tTX)X\\\"R@4Ndr}3H|;e/'jO$K5@n*h\\\\Zud{LHSZls=w7 !w;F:z<Higus%HO-R\\\"GOb9}8UC#&NG\\\"l:\\\"t8\"}")
        .when()
            .request( "POST", "/verb")
        .then()
            // Body.application-json.Value.Properties.third.Type=Not string
            .statusCode( isBadRequest())
            ;
    }

    @Test
    public void postVerb_BodyApplicationJsonValuePropertiesFirstsType_Is_Null() {
        given()
            .baseUri( forTestServer( "http://localhost:8080/v1"))
            .contentType( "application/json")
            .request().body( "{\"firsts\":null,\"name\":\"=t+C.o^a,@Z}KP!v_d\\\"iqgOz2wc*uGX}n>+:FUQQqy.}Mvg~dQTZOv*?bc)Wg+!pWE0&N>G,F_1\\\\(>hr)' .d*)X48s!eETGRm1)N;Q&6#@D39o][~,h(*^\\\\Kx?L6T5vX\\\\2ecL,'#<i(m%QC!y=EQZ,+t<KxF4(km1|UH%E\"}")
        .when()
            .request( "POST", "/verb")
        .then()
            // Body.application-json.Value.Properties.firsts.Type=null
            .statusCode( isBadRequest())
            ;
    }

    @Test
    public void postVerb_BodyApplicationJsonValuePropertiesFirstsType_Is_NotString() {
        given()
            .baseUri( forTestServer( "http://localhost:8080/v1"))
            .contentType( "application/json")
            .request().body( "{\"firsts\":{\"cwyrmei\":[],\"y\":846,\"x\":[]},\"name\":\"4<L[}bbynL!VehDIH9!\\\\I3|1J<>jm!#M%y9%=Am}Pwp7Y*_<9J1`f brut+Kghmn0n2MIApFB\"}")
        .when()
            .request( "POST", "/verb")
        .then()
            // Body.application-json.Value.Properties.firsts.Type=Not string
            .statusCode( isBadRequest())
            ;
    }

    @Test
    public void postVerb_BodyApplicationJsonValuePropertiesSecondsType_Is_Null() {
        given()
            .baseUri( forTestServer( "http://localhost:8080/v1"))
            .contentType( "application/json")
            .request().body( "{\"seconds\":null,\"name\":\"/_g[~4MamXyvk93Zr U\\\"R2*M~BR''^y^2'1wjj%$-[/U?l\\\"`:rXo[//onWnGXU{!)[I/>*&\\\"Xk><6E%j,o(E+]6&IC8-7rgN;^ =/V]&qyBTq^e51iu])%$LX&;V1zOv8sNnuOL)-}Cgc\\\"i-EXNmc:5V8[\\\"29/O&ImqgM0.kWp Esu:/ ~1GvT_S&yaC|u2r%[%R\"}")
        .when()
            .request( "POST", "/verb")
        .then()
            // Body.application-json.Value.Properties.seconds.Type=null
            .statusCode( isBadRequest())
            ;
    }

    @Test
    public void postVerb_BodyApplicationJsonValuePropertiesSecondsType_Is_NotString() {
        given()
            .baseUri( forTestServer( "http://localhost:8080/v1"))
            .contentType( "application/json")
            .request().body( "{\"seconds\":true,\"name\":\"<&+c9\\\\j]G:,xz)<)OSU*!C-1F\\\\i_K*ace3U)|-Kj|3&B@CZahOWv8J>F.R\\\"PQY!Aw4^8VS.xPe,Y\\\"sz}<wW}\\\"kz2^d`!]WB_lj})WjWb$mBWKK.bXw.he\\\"~Y+*3UzQs1pRIk5ZDiWVH7\\\"2RjiT1\\\"yQ_N<ZtG@7TKMr[^}C1]*lfTNnz'J\\\"Ja4nH{Jnm=I<\\\\@h!sq-L\"}")
        .when()
            .request( "POST", "/verb")
        .then()
            // Body.application-json.Value.Properties.seconds.Type=Not string
            .statusCode( isBadRequest())
            ;
    }

    @Test
    public void postVerb_BodyApplicationJsonValuePropertiesThirdsType_Is_Null() {
        given()
            .baseUri( forTestServer( "http://localhost:8080/v1"))
            .contentType( "application/json")
            .request().body( "{\"thirds\":null,\"name\":\"b_gddp29<gQyZ&RxE\\\\U~(%I\\\\i6s-K4ilwO8~rO5wARj;2#lb5=j.P1qq5FofyXqUZF)y5h})o6/2^3F9:fyFAUnW\\\\~HFRk9GA<cCXm~|D/n{|v_?+=)mK-sk//-jT543X&145xlPV[rh(OX>rYb1\"}")
        .when()
            .request( "POST", "/verb")
        .then()
            // Body.application-json.Value.Properties.thirds.Type=null
            .statusCode( isBadRequest())
            ;
    }

    @Test
    public void postVerb_BodyApplicationJsonValuePropertiesThirdsType_Is_NotString() {
        given()
            .baseUri( forTestServer( "http://localhost:8080/v1"))
            .contentType( "application/json")
            .request().body( "{\"thirds\":{\"fhhxhwdaydel\":[\"oI\",\"0'?0\",\"-ju\"],\"rkspxhedxehz\":[\"'kj,L\",\"UcnG5ExW\"]},\"name\":\"{v2JXc_l46``Kh=*h~}Z+~ACHG+Zn}#\\\\Ov7Rqp=rW5[LoN#M4a>RQ[|3={SC]au93^+'oI\\\\9ZA}G_C+v.p?*h/F<\"}")
        .when()
            .request( "POST", "/verb")
        .then()
            // Body.application-json.Value.Properties.thirds.Type=Not string
            .statusCode( isBadRequest())
            ;
    }

    @Test
    public void deleteVerbName_NameDefined_Is_Yes() {
        given()
            .baseUri( forTestServer( "http://localhost:8080/v1"))
            .pathParam( "name", "a")
        .when()
            .request( "DELETE", "/verb/{name}")
        .then()
            .statusCode( isSuccess())
            ;
    }

    @Test
    public void deleteVerbName_NameValueLength_Is_Gt_1() {
        given()
            .baseUri( forTestServer( "http://localhost:8080/v1"))
            .pathParam( "name", "qeooJ/}xjZO%66_b\"]Y e^|__=x2fKgDpDJ{{QlXn8QT1/HX\"vhMilQT?:MhAci'+g^NFIaOZ3>NYtiOqp `Y@$-6'6fFB?C?<'[Mfl7I|`P^1h<W*FHY+&PRc5g\\VfI,yA^grO,my")
        .when()
            .request( "DELETE", "/verb/{name}")
        .then()
            .statusCode( isSuccess())
            ;
    }

    @Test
    public void deleteVerbName_NameType_Is_Null() {
        given()
            .baseUri( forTestServer( "http://localhost:8080/v1"))
            .pathParam( "name", "")
        .when()
            .request( "DELETE", "/verb/{name}")
        .then()
            // name.Type=null
            .statusCode( isBadRequest())
            ;
    }

    @Test
    public void getVerbName_NameDefined_Is_Yes() {
        given()
            .baseUri( forTestServer( "http://localhost:8080/v1"))
            .pathParam( "name", "e")
        .when()
            .request( "GET", "/verb/{name}")
        .then()
            .statusCode( isSuccess())
            ;
    }

    @Test
    public void getVerbName_NameValueLength_Is_Gt_1() {
        given()
            .baseUri( forTestServer( "http://localhost:8080/v1"))
            .pathParam( "name", "M!b#sXU0 .\\@I1j+u>hTjbfjgKOEL_\"tbw<4R?!Re'V*F?9F4uWNpQAHhrco~thhD&-*O=}N--qDaXR\\b3><(Ba9NeHyBL<T}Cq\"Ks=$I+t?*]z-{V(!ZqHb_CT@9B")
        .when()
            .request( "GET", "/verb/{name}")
        .then()
            .statusCode( isSuccess())
            ;
    }

    @Test
    public void getVerbName_NameType_Is_Null() {
        given()
            .baseUri( forTestServer( "http://localhost:8080/v1"))
            .pathParam( "name", "")
        .when()
            .request( "GET", "/verb/{name}")
        .then()
            // name.Type=null
            .statusCode( isBadRequest())
            ;
    }

    @Test
    public void putVerbName_NameDefined_Is_Yes() {
        given()
            .baseUri( forTestServer( "http://localhost:8080/v1"))
            .pathParam( "name", "D")
            .contentType( "application/json")
            .request().body( "{}")
        .when()
            .request( "PUT", "/verb/{name}")
        .then()
            .statusCode( isSuccess())
            ;
    }

    @Test
    public void putVerbName_NameValueLength_Is_Gt_1() {
        given()
            .baseUri( forTestServer( "http://localhost:8080/v1"))
            .pathParam( "name", "M^>lb&Li~.beV1cD%y4yI7wGYrq*Ym^A<9cz`KAC9wg<vfEWmg.4>C!m5Xsf[IsJ5+<dUdfaR0Ssu'C~AiMOKycAb>DdDO9p\"'A(Y/SJIn<-$8N2_6R(U@`,CPAX+,2X3S]BQzU&k7qg57{UjGu*^Br7uKk>JXq7sT~h.<$tt6lT2z{d8bkeHY5XDx%lusRe,(JE7NPX8")
            .contentType( "application/json")
            .request().body( "{\"thirds\":\"{Z^}>jCw_QEfSua(6hXj^qZ_4FedPE2vOSi0!WiA=F!2gQ'c*tLYNw4.u?g$P*tzQbP$WLNr;!bfP$UvuPV<VO@fhMBye 0*)^@ evnsiU$W.69%l5(BY%9C4o;=?|\\\"_xWd#GqJaWt];^yL;<>'qN]au:ohb\",\"seconds\":\"h]*<l}kDt.4~M;*E;}'}wIPG\\\\m9H^d+_;.zd=!v0.(:DBoAjis=T95y@DN},>38~@#jw[AHB{[K]y$}N{Wh#L6[G id}Hs%&l3&E5xn\\\\1c%wm[>^b[s4(&9j)UGZa!bH8]UUcL)kXX2FU{ } HrX&C\\\"VM\",\"third\":\"-x':\\\"H\\\\tK3LC=`W7g#@{+F`e5$\\\\]ip{wn7b0UbzrZNb85*&H#%at=\\\\UFR<v E}*~Hq66NKR[5ZM+HXji,3+%8j1Vh7Vk;&$\\\"8IN%\\\\)[l5elv`3c5B?LPGEH4]n#0^b;'[h!lAh88$Sw\\\"R-s~J*cjJNO+ilc\\\"*XDVGC*Y7kc%C<Iz5I2%.P*NMG^Bk,xK$t\\\"}CVwXs_<G~>`\",\"name\":\"xI~B>2xrzZez|;sTA}W!46]`BN8xq\\\"8|=:8&NcIQ i}#;* 2i=/h/18,~|Zo#H=C2Hc!tgPesJp[`[i^k\",\"firsts\":\";-Z= TM$mS,.<3mrL*x{c0Jk3Gd8\\\\;3q !-oK,Y+,6BwK|0GsU= Z3$d0:i@MQl$I{b|Tv3\\\\A\\\\,_X!Z#TK>$iHF=x(3h4:8Q~x|O|L]Mo Hmr[xxY8#Z{x_TceDuokn('b|<Ueaeo0OK`]QPL)Xw\",\"first\":\"okR\\\\ Xj_S0S(z(Y)td,ZiYlEU2cTK1;eHkL=@TO8zRG9?|J3sWxB_o-c@YOLZF>z[Ukm?9!{f0jd.%6JPXL'L}5Ann6A=2|=(JfRV3ncQz9>{}\\\\UK,>C5[TV]O(T13S3V={HlfE/fm;adJ//uS_wB>H&ro&OUXZ_vTn0R7B,u:T,}4@0rWo9Jo<O{:SyzFO8CKTg+!>G@5K_bHT}9/a}_Gzkc1y9u?&ZZZ=c&9]ew9\\\"\\\"s}X@dZ6,vCd\",\"second\":\"E7:8N!&.~Pf5yb`Oirh]tEQt 71?3WZgmL\",\"jqnvccqzqzik\":-942,\"yvrsjmkicdb\":true}")
        .when()
            .request( "PUT", "/verb/{name}")
        .then()
            .statusCode( isSuccess())
            ;
    }

    @Test
    public void putVerbName_BodyApplicationJsonValuePropertiesNameValueLength_Is_0() {
        given()
            .baseUri( forTestServer( "http://localhost:8080/v1"))
            .pathParam( "name", "z")
            .contentType( "application/json")
            .request().body( "{\"name\":\"\"}")
        .when()
            .request( "PUT", "/verb/{name}")
        .then()
            .statusCode( isSuccess())
            ;
    }

    @Test
    public void putVerbName_BodyApplicationJsonValuePropertiesFirstValueLength_Is_0() {
        given()
            .baseUri( forTestServer( "http://localhost:8080/v1"))
            .pathParam( "name", "6O6`+Wkf\\}jZh]?$B_t2#;`2=(kAJ3Kr'B\\E}>_M2T `jkcyn])$M^G+~QM`ASdm,cX\\@n0}HO=b61)uaem!6G6tX%P,}n>)LKF/gWH|;OWdxio63nL#3E b`<I Frj*<x80Ws+_uC=5TM,FP|T'z8Gz>S|unCUVm.v8")
            .contentType( "application/json")
            .request().body( "{\"thirds\":\"\",\"seconds\":\"\",\"third\":\"\",\"firsts\":\"\",\"first\":\"\",\"second\":\"\",\"ajnmwaazpwqtpld\":{\"xpjqknxezrj\":-953.4,\"rifeqd\":true},\"papftkbc\":[\"{j\",\"\",\",&mPJw2\"]}")
        .when()
            .request( "PUT", "/verb/{name}")
        .then()
            .statusCode( isSuccess())
            ;
    }

    @Test
    public void putVerbName_NameType_Is_Null() {
        given()
            .baseUri( forTestServer( "http://localhost:8080/v1"))
            .pathParam( "name", "")
            .contentType( "application/json")
            .request().body( "{\"name\":\"aD/,r.^UwW:RE( ^0p$g@}\\\\z#n|l5%CqT'\\\"Z2Yqf-x!A,R?(N`\\\\\\\\(At]m,o_!(f-kX$iOc3CE1f7OZbI9y2YFZNU t;M@:%{ts5 AgW^T\\\" gq%ML!9Oa\\\\zo+btM;8:8&SFg?#1.[e-yY '@89DZK!JWZjI+&:VB>KTyBmDfih]pBOlIpQ:|<o)50,zu<jOFPg40XyuzZ3^qOVK_;\"}")
        .when()
            .request( "PUT", "/verb/{name}")
        .then()
            // name.Type=null
            .statusCode( isBadRequest())
            ;
    }

    @Test
    public void putVerbName_BodyDefined_Is_No() {
        given()
            .baseUri( forTestServer( "http://localhost:8080/v1"))
            .pathParam( "name", "P")
        .when()
            .request( "PUT", "/verb/{name}")
        .then()
            // Body.Defined=No
            .statusCode( isBadRequest())
            ;
    }

    @Test
    public void putVerbName_BodyMediaType_Is_Other() {
        given()
            .baseUri( forTestServer( "http://localhost:8080/v1"))
            .pathParam( "name", "^")
            .contentType( "application/x-www-form-urlencoded")
            .formParam( "integer", "-648")
        .when()
            .request( "PUT", "/verb/{name}")
        .then()
            // Body.Media-Type=Other
            .statusCode( isBadRequest())
            ;
    }

    @Test
    public void putVerbName_BodyApplicationJsonType_Is_Null() {
        given()
            .baseUri( forTestServer( "http://localhost:8080/v1"))
            .pathParam( "name", "$")
            .contentType( "application/json")
            .request().body( "null")
        .when()
            .request( "PUT", "/verb/{name}")
        .then()
            // Body.application-json.Type=null
            .statusCode( isBadRequest())
            ;
    }

    @Test
    public void putVerbName_BodyApplicationJsonType_Is_NotObject() {
        given()
            .baseUri( forTestServer( "http://localhost:8080/v1"))
            .pathParam( "name", "n")
            .contentType( "application/json")
            .request().body( "-599.1")
        .when()
            .request( "PUT", "/verb/{name}")
        .then()
            // Body.application-json.Type=Not object
            .statusCode( isBadRequest())
            ;
    }

    @Test
    public void putVerbName_BodyApplicationJsonValuePropertiesNameType_Is_Null() {
        given()
            .baseUri( forTestServer( "http://localhost:8080/v1"))
            .pathParam( "name", "n")
            .contentType( "application/json")
            .request().body( "{\"name\":null}")
        .when()
            .request( "PUT", "/verb/{name}")
        .then()
            // Body.application-json.Value.Properties.name.Type=null
            .statusCode( isBadRequest())
            ;
    }

    @Test
    public void putVerbName_BodyApplicationJsonValuePropertiesNameType_Is_NotString() {
        given()
            .baseUri( forTestServer( "http://localhost:8080/v1"))
            .pathParam( "name", "2")
            .contentType( "application/json")
            .request().body( "{\"name\":[\"J\"]}")
        .when()
            .request( "PUT", "/verb/{name}")
        .then()
            // Body.application-json.Value.Properties.name.Type=Not string
            .statusCode( isBadRequest())
            ;
    }

    @Test
    public void putVerbName_BodyApplicationJsonValuePropertiesFirstType_Is_Null() {
        given()
            .baseUri( forTestServer( "http://localhost:8080/v1"))
            .pathParam( "name", "f")
            .contentType( "application/json")
            .request().body( "{\"name\":\"+Jhm]!}iF4*?ar.;n%B.!O&hivU!{8Yb4ryA^lG:>|I|@Lsq6nRhXT?0\\\\[]xg+%C|4pDJmm$40<yR@T7Ol+l!ex2:$<J%\\\"Y$Mh}R,wfbJ;&_cP@8n-ak$}Mm|FLKW] VQ:yI8r`-AOg5tGUSq}de>NKu\\\\k7 NQ/aQC-UPva5ILd$~$r+1K5iF45oB9QnDaWHdi+/$g6\",\"first\":null}")
        .when()
            .request( "PUT", "/verb/{name}")
        .then()
            // Body.application-json.Value.Properties.first.Type=null
            .statusCode( isBadRequest())
            ;
    }

    @Test
    public void putVerbName_BodyApplicationJsonValuePropertiesFirstType_Is_NotString() {
        given()
            .baseUri( forTestServer( "http://localhost:8080/v1"))
            .pathParam( "name", "c")
            .contentType( "application/json")
            .request().body( "{\"name\":\")V>JnY)~Hw,q.R0hn4; YUx)rIc%bqf2{]6wgzx58J&S!1]qb_cOhs,]%5Gw$1x`y^CR_~\",\"first\":{\"mgzca\":-299.7,\"k\":-567}}")
        .when()
            .request( "PUT", "/verb/{name}")
        .then()
            // Body.application-json.Value.Properties.first.Type=Not string
            .statusCode( isBadRequest())
            ;
    }

    @Test
    public void putVerbName_BodyApplicationJsonValuePropertiesSecondType_Is_Null() {
        given()
            .baseUri( forTestServer( "http://localhost:8080/v1"))
            .pathParam( "name", "E")
            .contentType( "application/json")
            .request().body( "{\"name\":\"0@29ZeVg$fKZOp['OZmN\\\\C:<D9GhU7(BM(H'kB/P+CGbY4U@{ENEMsf$zl9xj\\\"k%C\\\\Y3$GagTQ(I_Py<SOxeJE!H`+\\\"bWK\\\\;c p-eZM8YwPcSX+|n{p'g@`h2YV7J'+hH$.b@h?8SR!|6r13?IE?buLx#`QC6yl|U!QM|XXI\",\"second\":null}")
        .when()
            .request( "PUT", "/verb/{name}")
        .then()
            // Body.application-json.Value.Properties.second.Type=null
            .statusCode( isBadRequest())
            ;
    }

    @Test
    public void putVerbName_BodyApplicationJsonValuePropertiesSecondType_Is_NotString() {
        given()
            .baseUri( forTestServer( "http://localhost:8080/v1"))
            .pathParam( "name", "!")
            .contentType( "application/json")
            .request().body( "{\"name\":\"8^]!MF~X7(~VVq#N@/3Tde9wN@_8!AL%ri#UxC9@9jga{Fzc=J_P6jqANTgU'~)dcxX|Il3|H$=)798[n|H<|\\\\ngJz(|iGxZ66IBr{|s3$E]]<(So{1_{4ncIW&Lo<e7aGl FtSJ'uMr4y(y\\\\#>2b\\\"b1KKx!o?\\\\;P=lA7[bR]!2T[yYK^TL;_ Pp,ic}LrqH@4{P\",\"second\":true}")
        .when()
            .request( "PUT", "/verb/{name}")
        .then()
            // Body.application-json.Value.Properties.second.Type=Not string
            .statusCode( isBadRequest())
            ;
    }

    @Test
    public void putVerbName_BodyApplicationJsonValuePropertiesThirdType_Is_Null() {
        given()
            .baseUri( forTestServer( "http://localhost:8080/v1"))
            .pathParam( "name", "4")
            .contentType( "application/json")
            .request().body( "{\"third\":null,\"name\":\"_e`.Df6}QjJ1ihuIct;.&F?0<Geeq&^sWCP_\\\\$0f]J?mU'9}G^&_>ue8\"}")
        .when()
            .request( "PUT", "/verb/{name}")
        .then()
            // Body.application-json.Value.Properties.third.Type=null
            .statusCode( isBadRequest())
            ;
    }

    @Test
    public void putVerbName_BodyApplicationJsonValuePropertiesThirdType_Is_NotString() {
        given()
            .baseUri( forTestServer( "http://localhost:8080/v1"))
            .pathParam( "name", "D")
            .contentType( "application/json")
            .request().body( "{\"third\":[\"k{Z(jC&p\"],\"name\":\"eo<AP?9v]+c-3Q-Ka~kb<+{C<(yg-D |ghC~cm~%V.H{1dbWPQlZ)^0JYk[Esdk0D]d*y*e#xX#uWyL!.NIT3e\\\"dJ^-\\\\z&&HlZ.O73i<DVeKu`)8 DqZb}I#k_QV~.IdED90F2r/;3Xke_Gd1) /U#dZ/9/grwJ\\\\bqf[HmH6S8#R6Xv|(W*BI&lfh\\\"_(CWY2\"}")
        .when()
            .request( "PUT", "/verb/{name}")
        .then()
            // Body.application-json.Value.Properties.third.Type=Not string
            .statusCode( isBadRequest())
            ;
    }

    @Test
    public void putVerbName_BodyApplicationJsonValuePropertiesFirstsType_Is_Null() {
        given()
            .baseUri( forTestServer( "http://localhost:8080/v1"))
            .pathParam( "name", "=")
            .contentType( "application/json")
            .request().body( "{\"firsts\":null,\"name\":\">6Oa\\\\d6EExx]-*^y+bg .CQNGSyClLG7C+\\\"rfHQ!#p2i*Nyu6G<aHmuY/v)NeC0|.b{iF$l`?)<qWL@}erC2xk\"}")
        .when()
            .request( "PUT", "/verb/{name}")
        .then()
            // Body.application-json.Value.Properties.firsts.Type=null
            .statusCode( isBadRequest())
            ;
    }

    @Test
    public void putVerbName_BodyApplicationJsonValuePropertiesFirstsType_Is_NotString() {
        given()
            .baseUri( forTestServer( "http://localhost:8080/v1"))
            .pathParam( "name", "z")
            .contentType( "application/json")
            .request().body( "{\"firsts\":-195.4,\"name\":\"zdE|lI{.Nwsj=b[3YB}AkH{>A*Oc<>)+kKH4c8_8ckita=yV8?Xl?@9FNR](uK 7m8P,\\\"dhLp/inx<Fo bS_/ZFM6~\\\"=O,e<w2W1Ni%sk6f24TzOItO>^,5e\\\\ k;`OUM)SIMb\"}")
        .when()
            .request( "PUT", "/verb/{name}")
        .then()
            // Body.application-json.Value.Properties.firsts.Type=Not string
            .statusCode( isBadRequest())
            ;
    }

    @Test
    public void putVerbName_BodyApplicationJsonValuePropertiesSecondsType_Is_Null() {
        given()
            .baseUri( forTestServer( "http://localhost:8080/v1"))
            .pathParam( "name", "L")
            .contentType( "application/json")
            .request().body( "{\"seconds\":null,\"name\":\"Xh)rA;dF4I_ E,7t>;e2\\\"#~7DYI:V^}tO|+y:a+:B3{k9$sr{c}\"}")
        .when()
            .request( "PUT", "/verb/{name}")
        .then()
            // Body.application-json.Value.Properties.seconds.Type=null
            .statusCode( isBadRequest())
            ;
    }

    @Test
    public void putVerbName_BodyApplicationJsonValuePropertiesSecondsType_Is_NotString() {
        given()
            .baseUri( forTestServer( "http://localhost:8080/v1"))
            .pathParam( "name", "7")
            .contentType( "application/json")
            .request().body( "{\"seconds\":-290,\"name\":\"_W/cmMa~\\\"}Esbj?aJ;kckc8.=Hoa_C\"}")
        .when()
            .request( "PUT", "/verb/{name}")
        .then()
            // Body.application-json.Value.Properties.seconds.Type=Not string
            .statusCode( isBadRequest())
            ;
    }

    @Test
    public void putVerbName_BodyApplicationJsonValuePropertiesThirdsType_Is_Null() {
        given()
            .baseUri( forTestServer( "http://localhost:8080/v1"))
            .pathParam( "name", "{")
            .contentType( "application/json")
            .request().body( "{\"thirds\":null,\"name\":\"oP;h{8H+!q.htojv~}_RpZx?VDt]rrkS}hLze5;Ghb,{EpEl{\"}")
        .when()
            .request( "PUT", "/verb/{name}")
        .then()
            // Body.application-json.Value.Properties.thirds.Type=null
            .statusCode( isBadRequest())
            ;
    }

    @Test
    public void putVerbName_BodyApplicationJsonValuePropertiesThirdsType_Is_NotString() {
        given()
            .baseUri( forTestServer( "http://localhost:8080/v1"))
            .pathParam( "name", "\\")
            .contentType( "application/json")
            .request().body( "{\"thirds\":{},\"name\":\"VpyNU T.}udHdX]!;mvz3<5%=N]MI;AZkB]-FQFvO=L0I3+[mW^Am(vN^i0W8!Z^_\\\\*`Ju&1>CSM}'t\\\"5(BrfKonox<DbQW>]MN(sNB-sh\\\"*$Z$A`+_4d6U4fz(8x^)g'X*$\\\\Z5lwc9R\\\":x,-+z:a&9B#1W,{3ykqCf@!]KxgiIn-8lKWt~2~N3fibz_R\\\\9 \\\\-zoi\"}")
        .when()
            .request( "PUT", "/verb/{name}")
        .then()
            // Body.application-json.Value.Properties.thirds.Type=Not string
            .statusCode( isBadRequest())
            ;
    }
 */
    private static Matcher<Integer> isSuccess() {
        return allOf( greaterThanOrEqualTo(200), lessThan(300));
    }

    private static Matcher<Integer> isBadRequest() {
        return allOf( greaterThanOrEqualTo(400), lessThan(500));
    }

    private static String forTestServer( String defaultUri) {
        String testServer = tcasesApiServer();
        return
            defaultUri == null || !testServer.isEmpty()
            ? testServer
            : defaultUri;
    }

    private static String tcasesApiServer() {
        String uri = System.getProperty( "tcasesApiServer");
        return uri == null? "" : uri.trim();
    }
}
