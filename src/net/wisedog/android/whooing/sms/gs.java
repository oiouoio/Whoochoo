/**
 * 
 */
package net.wisedog.android.whooing.sms;

/**
 * @author newmoni
 *
 */

public final class gs
{
  String[] a = { "카드", "체크", "금고", "KB", "BC", "NH", "CARD", "광주", "Citi", "증권", "동양", "삼성", "농협", "은행", "롯데", "신한", "하나", "우리", "KEB", "경남", "한성", "부산", "전북", "제일", "신협", "기타매체", "대체", "출금", "입금", "이체", "ＣＤ", "우체국", "비자", "잔액", "COMPANY", "승인", "취소" };
  private String[] b = { "Forward", "114", "0102000", "0112000", "019000", "022191", "0588", "05881788", "15440000", "15443000", "15443311", "15445000", "15447200", "15447000", "15448282", "15661000", "15662566", "15665050", "15666000", "15666202", "1571", "15776000", "15776200", "15778000", "15880365", "15881500", "15881515", "15881599", "15881600", "15881788", "15881900", "15882100", "15882323", "15882588", "15882600", "15883200", "15883400", "15883322", "15884000", "15884200", "15884477", "15884500", "15884560", "15885000", "15886200", "15886622", "15886700", "15887000", "15887171", "15888100", "15888700", "15888710", "15888900", "15889200", "15889955", "15889999", "15991111", "15991155", "15991599", "15995000", "15998000", "15998245", "15998800", "15999000", "16000523", "16004000", "16008585", "16449999", "82588", "8229505810", "8229508510", "82237041004", "0220008000", "0220008100", "0220041004", "0220085000", "0220772587", "0237041004", "0237738245", "029508510", "0234494373", "024107777", "0317769300", "0312297031", "0415599021", "0424805071", "0552228100", "0552665111", "0622395000", "0647200200", "099" };

/*  public final int a(String paramString1, String paramString2, boolean paramBoolean)
  {
    int i;
    int j;
    if (paramBoolean)
    {
      i = 1;
      this.b[0] = paramString2;
      j = 0;
      if (j < this.b.length);
    }
    while (true)
    {
      return i;
      if (paramString1.contains(this.b[j]))
      {
        j = this.b.length;
        i = 0;
      }
      j++;
      break;
      i = 0;
    }
  }

  public final boolean a(String paramString1, String paramString2, String paramString3)
  {
    boolean bool = false;
    int i;
    int j;
    label35: String[][] arrayOfString;1;
    int k;
    int m;
    label89: int i7;
    int n;
    if (paramString1.length() > 10)
    {
      this.b[0] = paramString3;
      i = 0;
      if (i < this.b.length)
        break label3283;
      j = 0;
      if (j != 0)
      {
        arrayOfString;1 = new String[][] { { "동양", "청구금액" }, { "포인트리", "사용" } };
        k = 0;
        m = 0;
        if (m < arrayOfString;1.length)
          break label3309;
        if (k == 0)
        {
          if (paramString1.replaceAll("[^0-9]", "").length() <= 0)
            break label3505;
          i7 = 0;
          n = 0;
          label124: if (i7 < this.a.length)
            break label3351;
        }
      }
    }
    while (true)
    {
      String[] arrayOfString;
      int i1;
      int i2;
      label2835: String[][] arrayOfString;2;
      int i3;
      int i4;
      label3214: String[][] arrayOfString;3;
      int i5;
      if (n != 0)
      {
        arrayOfString = new String[] { "신한기프트거절", "신한카드승인거절", "신한체크거절", "계좌잔액이 부족합니다", "승인번호는", "[하나SK캐쉬백]", "확인해주세요", "연락드려요", "쿠폰번호:", "유효기간:", "[공지문]", "최고의 혜택", "참고하시기", "SKT공지", "해지카드", "한도:잔여", "세이브이용가능", "결제됩니다.", "적용기간", "납부일입니다", "교체대상", "조회하였습니다", "일부만인출되셨", "인감분실", "원이 출금되었습니다.", "감사할인]", "유종불일치로", "함께합니다", "배달예정", "님 명의로", "개월개통", "전용계좌안내", "평가금액안내", "도착안내", "사칭문자", "연락드리겠습니다", "분실도난으로", "발송해 드렸습니다", "복지자금 배정안내", "주소변경", "반송되었습니", "전액불능", "입력하세요", "현금서비스잔여한도", "서비스제공시간아님", "신청안내", "신청해 주셔서", "만원까지이용", "신청종료일", "채권매도", "채권이자", "채권 만기", "신규신청", ":전화요망", "입금되어", "입금되었습니다. 감사합니다", "입금되었습니다.감사합니다", "입금제한", "입금요망", "입금전용", "제한됩니다", "입금바랍니다", "을 안내드립니다", "계좌비밀번호변경", "핸드폰번호변경", "도난분실카드", "전화금융사기", "양해바랍니다", "[공익채널]", "이체불능", "KOSPI", "가입을 감사드립니다", "정상가입되었습니다", "전산센터 이전", "전산개편으로", "은행업무중단", "금융거래 중단", "프로그램안내", "국방복지", "초과 안내", "중단됩", "전달되었습", "일시중단안내", "분실신고", "비밀번호상담", "등록/변경", "→", "★", "♣", "♣", "☎", "↓", "↑", "♡", "미결재액이", "카드결제액은", "[개인]금액통지", "사용안내,확인요망", "이자미납금 발생", "해외거절", "총결제", "결제금액", "현재 결제액은", "결제일", "결제하실", "결제대금", "결제마감일", "청구요금", "예정일", "잔여 한도는", "체크론", "분할상환", "카드센터", "권유등록처리", "결제예정", "충전 정상", "기본적립률이", "서비스등록이", "오류 입력으로", "입력오류발생", "배송예정", "서비스제한예정", "이체 예정", "차량에", "계좌등록", "주유소알리미", "카드이벤트", "명의도용", "할인한도", "거)080", "거부/o8o", "거부080", "거부/080", "거부:080", "거부)080", "거부 080", "거부시", "거부]080", "수신거부", "차단내역", "청구금액", "미납금액", "잔액부족", "중도해지", "이자율", "이체등록", "금리인하", "월이자", "당일지급", "대출가능", "연체", "송금", "캐시백", "SmartWallet", "무담보", "대출정보", "대출가능", "인증번호", "등록가능", "정상 변경", "등록완료", "중복가능", "금리행사", "카드콜서", "통화무료", "수익률", "공지사항", "Mypage", "[아이서치]", "[공지]", "신청일", "사은품", "가상계좌", "완납금액", "접수번호", "환불되었", "참고하세", "확인하세", "예정입니", "가능합니", "하셨습니", "주십시오", "등록되었", "발급되었", "부탁드립", "신청하신", "죄송합", "접수되었", "변경 되었", "발급 감사", "발송하였", "완납 되었", "등록하세", "선물하세", "신용등급", "신용지킴", "등록됐", "알림서비스", "거절080", "상담접수 완료", "증권번호", "축하드립", "축하합니", "미납중입니다", "수수료율", "이월잔액", "이월금액", "정보확인요망", "서비스 등록", "시큐어코드", "차량번호", "현금적립", "적립되었습니", "이자납입일", "납입일이", "배송관련", "배송이 시작", "계좌이체오류", "재발급", "InfoCare", "판매행사기간", "홈페이지:", "홈페이지 참조", "홈페이지참조", "일납입도래", "주 체결", "공인인증서", "카드다운로드", "변경됨", "계좌변경", "정보확인요", "해제완료", "해제되었습니다", "분실해제", "CVC2값", "변경 완료", "인증 번호", "보답하겠습", "신청되었습", "첫거래 감사", "서비스로보답", "보험 가입", "최저가할인", "카드제휴", "마지막 기회", "구매시", "결제시", "결제 시", "상품권증정", "정상등록", "모집공고", "할인쿠폰발급", "카드가능", "ⓞ", "[쉐어박스", "역대최고배당", "자유결제비율이", "이메일청구서가", "신청하세요", "배달완료", "http", "정기세일", "안녕하세", "답변이 완료", "적금 납입일", "반대매매", "직원일동", "마감임박", "발송완료", "세미나", "예약필수", "사용완료", "긍리", "자긍", "창구방문", "원리금", "타행대환", "증권 SAY", "고객센타", "신청결과", "개인회생", "선물증정", "학습안내", "한정세일", "홈피참조", "메일명세서", "출금실패", "펀드목표", "요청하신", "임시비밀번호", "이체비밀번호", "비밀번호3회", "씨티카드쇼핑몰 포인트", "카드결제예상액은", "유료신청 문의", "카드결재액은", "매도주문이", "농협알림", "계약 체결", "대상이십니다", "전환매도", "매수체결", "매도체결", "상담및", "월말까지", "안심클릭비밀번호", "조정되었습", "VM월정액제", "CD기수수료면제", "혜택을드렸습니다", "고객님의 잔여", "정상 납부되었", "결제계좌로", "고객님 잔여한도", "사용정지됩니다", "이용가능 총한도", "결제한도서비스설정액", "무료서비스", "해외에서 이용되었습니다", "상향되었습니다", "변경되었습", "전자어음 결제안내", "해지되었습", "정지됩니", "될수있습니", "정상결제됩니", "당월금액은", "현금서비스거절", "신한capital론", "잔고내 충전 예정", "카드발급이", "신고요망", "거부:통화", "카드론한도", "한도복원일은", "자동납부실패", "통신망작업 안내", "문의바람", "패스워드변경이", "외환은행환율정보", "발급받으세요", "완료됩니다", "ARS접수중", "이벤트 ARS", "정부지원금:", "펀드평가액", "만원이상 사용시", "안심클릭 비밀번호", "비밀번호 오류발생", "종료합니다", "미처리됨", "보관중입니다" };
        i1 = 1;
        i2 = 0;
        if (i2 < arrayOfString.length)
          break label3381;
        if (i1 != 0)
        {
          arrayOfString;2 = new String[][] { { "매수", "체결" }, { "가능통보", "드립니다" }, { "결제", "기준)," }, { "동양", "전액불능" }, { "신한 i", "순자산" }, { "특정한도", "만원 부여" }, { "승인거절", "현금서비스" }, { "승인거절", "한도초과" }, { "승인거절", "부족합니다" }, { "카드대금", "결제완료 감사합니다" }, { "맥스카드", "거절" }, { "삼성카드", "입금확인되었습니다" }, { "카드대금", "결제(완납). 감사합니다." }, { "삼성화재", "보험계약대출이자" }, { "olleh", "잔여별" }, { "전량매수", "주문번호" }, { "빈소", "발인" }, { "신한 i", "KOSPI200" } };
          i3 = 1;
          i4 = 0;
          if (i4 < arrayOfString;2.length)
            break label3407;
          if (i3 != 0)
          {
            arrayOfString;3 = new String[][] { { "현대카드", "계좌로", "환불됐습니다" } };
            i5 = 1;
          }
        }
      }
      for (int i6 = 0; ; i6++)
      {
        if (i6 >= arrayOfString;3.length)
        {
          if (i5 != 0)
            bool = true;
          return bool;
          label3283: if (paramString2.contains(this.b[i]))
          {
            j = 1;
            break label35;
          }
          i++;
          break;
          label3309: if ((paramString1.contains(arrayOfString;1[m][0])) && (paramString1.contains(arrayOfString;1[m][1])))
          {
            m = arrayOfString;1.length;
            k = 1;
          }
          m++;
          break label89;
          label3351: if (paramString1.contains(this.a[i7]))
          {
            i7 = this.a.length;
            n = 1;
          }
          i7++;
          break label124;
          label3381: if (paramString1.contains(arrayOfString[i2]))
          {
            i2 = arrayOfString.length;
            i1 = 0;
          }
          i2++;
          break label2835;
          label3407: if ((paramString1.contains(arrayOfString;2[i4][0])) && (paramString1.contains(arrayOfString;2[i4][1])))
          {
            i4 = arrayOfString;2.length;
            i3 = 0;
          }
          i4++;
          break label3214;
        }
        if ((paramString1.contains(arrayOfString;3[i6][0])) && (paramString1.contains(arrayOfString;3[i6][1])) && (paramString1.contains(arrayOfString;3[i6][2])))
        {
          i6 = arrayOfString;3.length;
          i5 = 0;
        }
      }
      label3505: n = 0;
    }
  }*/
}