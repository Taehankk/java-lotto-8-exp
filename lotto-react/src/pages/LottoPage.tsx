import ButtonList from "../components/ButtonList";
import LottoList from "../components/LottoList";
import MoneyInput from "../components/MoneyInput";
import Title from "../components/Title";

function LottoPage() {
  return (
    <div>
      <Title />
      <MoneyInput />
      <LottoList />
      <ButtonList />
    </div>
  );
}

export default LottoPage;
