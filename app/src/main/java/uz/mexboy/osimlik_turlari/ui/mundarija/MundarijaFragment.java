package uz.mexboy.osimlik_turlari.ui.mundarija;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
;
import uz.mexboy.osimlik_turlari.MainActivity;
import uz.mexboy.osimlik_turlari.R;
import uz.mexboy.osimlik_turlari.adapter.MundarijaAdapter;
import uz.mexboy.osimlik_turlari.model.MundarijaModel;
import uz.mexboy.osimlik_turlari.ui.home.HomeFragment;

public class MundarijaFragment extends Fragment implements MundarijaAdapter.ItemClickListener {
    private Context mContext;
    private View root;
    private List<MundarijaModel> data;

    private RecyclerView recyclerView;

    private MundarijaAdapter mundarijaAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_mundarija, container, false);

        init();
        return root;
    }

    private void init() {
        data = new ArrayList<>();
        data.add(new MundarijaModel("So`z boshi", 3));
        data.add(new MundarijaModel("Farg`ona vodiysining qisqacha tabiiy-geografik tavsifi", 8));
        data.add(new MundarijaModel("Farg`ona vodiysida olib borilgan botanik tadqiqotlarning qisqacha tarixi", 14));
        data.add(new MundarijaModel("Farg`ona vodiysida tarqalgan O`zbekiston respublikasi qizil kitobiga kiritilgan\n" +
                "kamyob va endem turlari", 17));
        data.add(new MundarijaModel("Kamyob va endem turlarning kamyoblik maqomi bo`yicha tahlilar", 65));
        data.add(new MundarijaModel("Farg`ona vodiysi kamyob va endem o`simliklarini saqlab qolish muammolari", 66));
        data.add(new MundarijaModel("Farg`ona vodiysida tarqalgan o’zbekiston respublikasi qizil kitobiga kiritilgan\n" +
                "o’simlik turlari", 68));
        data.add(new MundarijaModel("Foydalanilgan adabiyotlar", 74));


        recyclerView = root.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(mContext));

        mundarijaAdapter = new MundarijaAdapter(mContext, data);
        mundarijaAdapter.setClickListener(this);
        recyclerView.setAdapter(mundarijaAdapter);

    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mContext = context;
    }

    @Override
    public void onItemClick(View view, int position) {
        MainActivity.defaultPage = data.get(position).getPage();

        MainActivity.toolbar.setTitle("Bosh sahifa");
        getActivity().getSupportFragmentManager().beginTransaction().
                replace(R.id.nav_host_fragment,
                        new HomeFragment())

                .commit();

        getActivity().getSupportFragmentManager().popBackStackImmediate();

        MainActivity.navPage = R.id.nav_home;


    }
}