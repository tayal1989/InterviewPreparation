package com.learning.strings;

/**
 * @author Vishal Agarwal
 * @version Creation time: 19-Jun-2021 2:06:17 pm
 * @classDescription
*/

public class RemoveAllAdjacentDuplicateCharacter {

	public static void main(String[] args) {
//		String str = "KaaKBbaB" ;
//		String str = "azxxzy" ;
//		String str = "aaaaaaaaa" ;
//		String str = "heejcjciegbdejajigjiijiiedjddibgjbebichbeadidiidhcjacagbjhajadbiigeceeahfijjiafcj";
		//hjcjciegbdejajigjjedjibgjbebichbeadiddhcjacagbjhajadbgecahfiiafcj
		String str = "jwdaqvliseqhfdrwfqratqgrgnakatjhfjblnhutlhdiwujuasddaksiieuakojprdtwkjiuvdearrqwgtfppofatmqwdmpdgmooiqpdewgfohisgfmlooomvtwbpvjpbatcwrvimdmtnfcbcnorlcqmavkhgbehuwofsppajpdssdwmmgqgnqhctevmdppoagnwlwvvhdnqjsesbrviejaftodtdutpkodoojnsrmfujtrbbamoofurudftfmouqspiodqiqtcoufpksatuglsscdcqmtcwrnnbewtvvdwkhmqgdcttoglheqnfghcvasobngfqhkevwkggosgojjjkqjnmcedqhwnkgirevdkibfwktcpuqvvoohcdtsshfeevvgakttkclkaiffsoomedppsiivgevslrtuedsvkosdtvegjesbfotdwphithrgrcqvjlttlrpcldangogtarkmopqapedqauluueqigugflwltabspludjnbljinnoegpivbugeuarwcancvpklchfawjtlmarnwkvnhowgiwpccnkkepaffahnjfhvpvqkoqweqjjtaipvgoshfkbpwdcposccdlwdltctdodhcdqvvlduwoftkjtqdnouvkthaevrcuvnjitvokdicejqcwvtiwsgbjmopvhbolkdfkgiorkvrstuppdrtkttqrjkomeowvwiukiaafoqrvlujjaqlqtidbgcsoqeqqtowwqmlbbobosdcbvtphgriaqoailnajcpsijjwunirbfcnklcqojwbjieihaslfneunpavohvajepjaemjdeqkvavgqkfckceemlvumoiebmhbparcgamuujdkdaongiamcruudcgsjlnbhwharfsoifoqrmlifaefhqvobwhpmobwtqaqasgdrnaibjgpdomstntgsfaamfdpvpvnatumpjmcpirquuusgehwuvucdukdujrefrebrwiorcjoqvwgfolcnalskepifggcjocrprnrtmnenelnoqadjqbgchefvkbtcwumebbnpcqbwlhifacbmhaulawbsdlisrcthejukjsjngddgdcorlmpkfasoctgurckbpaeumabeftmvamtgirriapqewmunfqutntinipsmlbwcsbwcgkfbanbpbemqcwfsphnbvoitlwocqwocmwboapgtilmnrnslowbsqbsffrjwkihcnnusvfbrwfbnhddhwwpphktfughslsbbsviqouprnqqsumgwenewnohgslqdfddjvikfnsauwdueoolcoerpohiluljuoarvmfpniwcpvhngmqaucoddiatrvreahkjlsaimlwgrpqbbflihqiivjhumprjrjbljpckrgofpachatchmiimtitipnhuqdnaqffumeddqawtmuoriaofbmahwctwijiaourthsbqwsvvfhuchhldjutqekppkuwdrrepiewqdbmbunjwqsqcncludfbvttcgercmeowwchnusfpjwtkufmimtirsanrkvfjtisbubgtqabckgdkdaesiijedpokkjisniipwmreveieivfmrhbpimfegewhgtkqjljrvcjdqvvmmmvsdvidcjsmragwmlgouncfdhbroiorulkprwfhbheubrnvffkqoihalkhamfiumfbmceparlollbljutqlabwcfkeedimpgkrkkaqwmkvtuttdaekbdhfcmvepbwsjelpvewhtjvqgcswrkjcajaoqndbsnopajvfijfvwofrlrsstcuiiebhdvjnkdgvoskqoaebwhwjejncfqsqkahmddjiafhcbpjglfqbmgrflbgemeerhfocfdotfmqjkleirsethaucwcmniiljiqskckrktjrorjrtoupisjvoggwqfpijpjvkqmwtwsalcolcklaflcmahgudnlcohqvmgajndvdtmmvfvqhouedkwtekurkmpoqtajtntmodcivercddjdmtruaqltkdruvsohwvtgscmweqqustqjgvpqwcatdofpfuucathopwucwrruvsvvovfujdvdcewiwdbammkthnikeqtbkdgrfncenbbcbgcwdtpjhbgcebrndsufqwtqsffqewhrcjmpcmcpbnjtwtlbpdwgloomeqmljsnbgldtuwwtnhiolacukdungrqagsintdwbugqjerdpjrsphhlhfsuhpancjdsrhqblnjamjnscffsakstsruwadhtrjrtknwjheeocrotaqeuhmdunfsocdwitotjrltcgvspeipvkvevebtsqjgojlcsknqspvgcvkbntocnnpnidsrfbevgpqegsfpndsjorbfvgakrtthkksinunhbnokadskeqvrpguqwwdqsbwmsldbvjehnswtlaqbhgamlkfwklsaibemlwjplhsvlptanvqfutvjurmusrrtcgpdwujjgpslmihcodbnriuwukhifpwclsoimglcgdkkkthbrlwqweugbnirjpkstmjwobkkovhgrjctasaighsdigpqkaociucchkqbrwiucfpgtjdelcdrnpqparihkbktdcrdqopefiegckjqifsqppdoeavejcpqghrorjtgwoqaqojvrqkajjssiitfpblrridjbcbhpajgreiomwecekfmptodeoraoshffhfmhtkmcqgicjemrvvtodkqcflsdtwmodluvarnojtctglirmukqvgvjqgcdhmisiraetplsqqmktnwkuvbsmghotebcqovlqibwlqbkuermtalnddkrjcbvjsvroatbccnwlwcujmcltqhuwwvtnnhdevjtqdbecfpphphlwrngvkvvmohdhqabwvckbswnfcbbombdegkinrgcnmcpkmluquofdkpdpgqnekkceialhdacinlcmdlvkomhugftgpmussqrikctmkjnlewsrguafakupungofgradamatogeqojhfdmnglufpdumdcwicrtbkjsvenmtsowwutnvujlhlduasdenjlvsjhwaqadgcdcriouwltujjfnuwfnlsbdibrackjeneqfplclbvqtlkejjbgdqlowfkaucthrudhovoldsiolefnuogissejkhtewokwhdruectjbrnwiqgqwwcguflfhkfbusogmeidnbcbovpvbjqbuqofqcmjwopjpjgvregjhwnohuukvohwtcbnvgmesoqatwlsmrhdrdrptmbfdwaudfcsoreuqdsulmupkuiiootoitfmpqcvnsmbbkrmfhldurcjslljupvumcsritftwfiffbbisgragwnbknmrhwdellieorutuvgvhgslanwpjvtdumucradewhtmhtparwrtrlekprshivlbdajjhprofimeufhiudmqpbovkjuhbbdeqrkpveeinalmaopqbrdmtdtpodfldewjawomelvfusnnndfujmfcjnpmvbltigqsonkgmocdahqsgdguqbpccgrwdcmbdeqeainopsbdlqehbsfawphtclimarlprtfrktdrjhjislwmimafhgejgfedtmvpbacuguiukahrugupdjthtallbcemnompiprnocgfsogqllucegdtaohgovulgseksoevofshugrvatkmwgvncvrbkrcwkejgkbpcovufplkutrcjhkfkptmlpofmmcvvgnhjwjodggduwqirowquewhvgstcgqpnwojtrbtmknoqskuiiktarfupjqcmftssmmsrekwfuqrsmujcqosgjipvohnbjsbcigogmkuolvqfojiimvuancpgdsmshwqtbtiaqbkqdqidumgaumtiirnqucbpdektrbvvsjubafkbcbtsuipqdheivfvbbllnuwjvcchokhsqjdhcpacojrpagmlbdtmngmevjlvvlmismgsvrqumawoeulecrtqnahddnwkplncuqdisirmmfejfdafqcubbiqppvvunlodvwhsejvdnjqmbhmkqugdussnailgbqovceskngujrabsbfbmramjwmethudassclkojkjwsvvrodfffoaidgbrclphaqhvmsurqnsiemkfgorukvlciqtgssquefejneqblfwfvnmueadivslabupjwdbmulleiowkudaecmwfrsfwrjkwjaaulorhdbsmtidcupvqqkltpmwqrpphwfmmdfujgtuljbaprunukhnpbtghnqkdawvachrjrepiiktpdtvobstsvnhokphubugknqijjeqrwqusjpoocahichornqvegvvhjtwshicasffmtlmlsngfccguacdmmhmrdhotpflijqsshvatjovruwcrpcvamvhbhigqjvkajomjwswjgihmbrqjfnjwjjsturvbidesasnlfdtafjehauhjtfttrpiqqpcihuljwwitsgfulrhqlvnvhlaafgpgvdalospgqovqodsthjvlsacnehpwrnmardkvtipnkhjhgcukojickhemrduepvelcgqgfdcveilwqhoribshihakfgjbjiearlildjqejobrumgbiaifaiewjtwjcmgqocaprladfosebeugbiaqvbaerfgatwfdprcaoontsfqbkntvihesmwajhakljmwqkahogfksrlpiuruwhphiwgqbiirdrniiusqvocgoakbleurvhewvgqakfmajampejgvilnmkikeinalhgtccbtdtsvktoncwkdpletqujloqjatrsbcsgfiabfkojdvieprncgwqnifcuqoakginmhtrcjuflvtvknpjnknvllegrhelkgldemdvaoughpdnkpqrmoiwoaohdsbgoktngvlanbwdhmrsljouqimeenaqtnwmcugampbdvpicurvideoeirjjgnnhgutofjbvnjddrvgwgskmwajprkkeedkqdhmhejspmacggbaektldqponrawsbpgsgsktenhwcsmgkfjbherneatubuhsoptvjhnifnahlgrbpminjratsmpcsdphjwnaehdrlmlocissldamorkodgjuenquqndawqrhktdrgwfgjbtbgqofuaumteaavkgiifomlgmedsdqgccwejpjwbdhqdhnkhmpnftvablrlpkdcqadmqqwfgdonhwvrjgfwebrvwdkfnrfmferuognwohnggmaauekeepahdrddiodlvskmeojoqsileedthkasvvoouqupplseedmevgnrvttuwcslgqkkpdiernqlfkbidnkdbuggljtdkcjfnbqqosdjcbwuvqillmslssuldhlhtmhugfboqudeujoeqvwijesidkvwbpjmipapmshhfdhaclaasusmtidlseegjnjcprtrqrhblattfninocidfwengsvvusknlfrstnnerrmvqkwwlivohnhiowewdrkvggwehgjgtmdevnavpvffkpqeebgpnkpvqvuilhpfsowfikjjrfhpkwehfcbggvjlrqlufgickpujiwjpbavrifeskujspejchplgkfmrbistleslsdedbnkbressdnwhjvsrdafnuljniksoeipfbiepiwensedmadlqbgbbtipmldmhrpwtkttsnujadnjuwqswoolkefbedqkojmcdngmjuncwkirveomfntcfkhipudssgncrgvccqiegpkeiphdlcpmaskcpkaaedcmrtjgsuakwoqiqfbmiidhepcaecrhgedkgiisopsomdbneudaddikmcdvljgrukwisbctlojeeermcphwmhiqtbqorteiokeewnngtqgdmrdarfiemjtpmrkjuukjpwarqdmpwujnodwtsdcdmlegoujeenvwsoeuarknwvshesdpiogptlbtutkfdocdovhlbmabceswhbdjiemjwlcgcbwthqhidwtsnhedqsfdkodkosgmgkjnwwrfaegctgroehirpddmearkpeanububpwfeiipspcbqaaopegcqihqjhimtvijunjaoqiugjdaeivuforjbdctpehnqbqufdrpdvqewaleerbsircbqdislffiwuebmfkaafebicqhnjeqkaspotqbnbpuaopfqufaqdptmiblbciojvmgooaiqpikpdoehadthccmtoqomsrbceilcekpuqnroiembfdbwnfqaujwrheednmtftgcalodihtqgdibqnupjlsadjsubjojwcfcasmtoqdlgcnwiwcjdskhnucjebrvtodkdbambcducchenovagdtssssphjnsfwgkescnrmgmiegbotumhwajpadrbmcojdgjfvkbjaabekaltclokbcsoqmrmhqwvsuiddubapkjlhmwmqljvadkvmamwcjkvqrudockfujtfkcdiooagwqkuwwsfkqllbieuvioiamvtpqwqjmwjbblshojdrejhkvjeeufaqmkivqpwrcjpwesdcwbhhrhvtphdwletbwmbjrccvhimgmfnfqhrdaebonbivcuktoeppomnfhnbuqgsbemeueutcncckmghkmnnlkcvsmjqdmwplulegroukkslrqstcnlisgichitmrnjpmeawmaopqgnqugustuannfbtneucqtkrqlbofctbbcawqlbcvnhpnbqfmtsgmwcwaskiqasiprbissoskanuslkgdjkivfvhbgjhmgicsckugbjintucpgvtidktqsfinbmacdvlkmcuocainkfjsjqudcmluhlqjqaisgqrtsnhenlieakedpfdkwpbvfwfdinrwosqnhgmmjcvifladvgsvrsfdirapcahmwhiulrlabpklfmjvgagntmkdaevucjwbingudgavwolskfkvsljpkopsnowvojgnmgafvetewlflfthfsfosrliptluevgridnedvmtrmivuwmmfrpfrurujokfthcqnsneeobmjqskpijgjlqjaemgtogrhiwivsgdiidcquptfkrttuwchgodcjjjclojanpiofehrvrhcmqjnqgwikkhuhejgsvulakdnjosbosdbijdjhipsbnmlgugmfamqdbfsdhtskjwtfobsvclvhiiapdtqlkpbvacdhlaqflnjlqaqrqnjlqdovwbvwqajgaljreaobaoesjlsbshbqiaujcnrqkifecgwnaesbuvasbeqsjoogpbpgssowkfwcegnwfvvmvrlvbvhobfacdtlqcbalwbouqerclgpvcgijbnhkosqieanemmadbtlhkuoaojopjkkumeblgqlvlbmujpownblilrdsdqovphdkggiotuhspgrjgemurdibrwvmivpvokmlwfjsrravwrfkomfardnjlrdhtdwaprwuvqedhwalajrvmdnrkjpteiooguppqlamdutjlqiprwislnunhtbkkscmsltqjolorkjqhftawtprkbevqposlqeiwutasfhesnbqsepownooeupflodelevljjcnlaosmlarwswgwpgiijkwpfmnacawidckobufonobslfanuhohfqckhsqrlvopoevupcjhvjcwoqvihmdajopewimvwvtufjslmbbhvhfkenjghucoipfbspfvpbhuwfcnqopigobdfchlhmpphrirdvriewfhqdukintknqbcjkkbrtfsanuwksewtqigcnipcjdtimqhknmveevhiqptvtlaemubtbebmvvqhpabpwmbjukrdeulpkvjnjiedalaolilrfodfwaivsogdkwqvidbwvjinctgabwqmtgtojgsntkncodikmekerkattwetqgwcqqdsdhbbrsvsltanjnekfiaaucrppgvbptrolkncvdmeiunbtfeeptpithovocvocuvjeklgbadhvfueinkffbbpbmcwupodwffkdkojnufdkegvhcearugvdgbrvgntnhkjqboejgdoqmimpurngsulqmseeqgkuaoeqanvefhtctnkdevroqggobisvqrembhegjjtprgbjtmtwqnuvnearcjuiqjrfkepogpqifmhdhbhpucdktsslastmbhfijreotiqpkhuh";
		String outputStr = "" ;
		boolean flag = true ;
		boolean lastFlag = true ;
		boolean lastCharacterCovered = false ;
		
		while(true) {
		
			for(int i = 0 ; i < str.length() - 1 ; i++) {
				if(str.toLowerCase().charAt(i) != str.toLowerCase().charAt(i + 1)) {
					outputStr = outputStr + str.charAt(i) ;
					
					if((i + 1) == str.length() - 1) {
						outputStr = outputStr + str.charAt(str.length() - 1) ;
						lastFlag = false ;
						lastCharacterCovered = true ;
					}
				} else {
					i++ ;
					if((i + 1) == str.length()) {
						lastFlag = false ;
						lastCharacterCovered = true ;
					}
				}
			}
			
			if((str.length() % 2) == 1 && lastFlag) {
				outputStr = outputStr + str.charAt(str.length() - 1) ;
				lastCharacterCovered = true ;
			}
			
			if(!lastCharacterCovered) {
				outputStr = outputStr + str.charAt(str.length() - 1) ;
			}
			
			for(int i = 0 ; i < outputStr.length() - 1 ; i++) {
				if(outputStr.toLowerCase().charAt(i) == outputStr.toLowerCase().charAt(i + 1)) {
					flag = true ;
					break ;
				} else {
					flag = false ;
				}
			}
			
			if(outputStr.length() <= 1) {
				break ;
			}
			
			if(flag) {
				str = outputStr ;
				outputStr = "" ;
				flag = true ;
				lastFlag = true ;
				lastCharacterCovered = false ;
			} else {
				break ;
			}
		}
		
		System.out.println("Output : " + outputStr);
	}

}